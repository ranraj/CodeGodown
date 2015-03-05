package com.portlet.sample.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletURL;

import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.DocumentImpl;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeIndexerUtil;
import com.portlet.sample.model.SampleEntry;
import com.portlet.sample.service.SampleEntryLocalServiceUtil;

public class SampleIndexer extends BaseIndexer {

	public static final String[] CLASS_NAMES = {SampleEntry.class.getName()};
	public static final String PORTLET_ID = "Test1";
	
	
	@Override
	public String[] getClassNames() {
		// TODO Auto-generated method stub
		System.out.println("getClassNames calling ");
		return CLASS_NAMES;
	}

	@Override
	public String getPortletId() {
		// TODO Auto-generated method stub
		return PORTLET_ID;
	}

	@Override
	protected void doDelete(Object obj) throws Exception {
		// TODO Auto-generated method stub
		SampleEntry entry = (SampleEntry)obj;
		Document document = new DocumentImpl();
		document.addUID(PORTLET_ID, entry.getEntryId());
		SearchEngineUtil.deleteDocument(entry.getCompanyId(), document.get(Field.UID));
	}

	@Override
	protected Document doGetDocument(Object obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("doGetDocument calling in SampleIndexer class ");		
		SampleEntry entry = (SampleEntry)obj;	
		long companyId = entry.getCompanyId();		
		long groupId = getParentGroupId(entry.getGroupId());
		long scopeGroupId = entry.getGroupId();
		long userId = entry.getUserId();		
		String userName = entry.getUserName();
		long entryId = entry.getEntryId();		
		String title = entry.getTitle();		
		String content = entry.getContent();		
		Date modifiedDate = entry.getModifiedDate();
		ExpandoBridge expandoBridge = entry.getExpandoBridge();
		Document document = new DocumentImpl();
		document.addUID(PORTLET_ID, entryId);
		document.addModifiedDate(modifiedDate);		
		document.addKeyword(Field.COMPANY_ID, companyId);
		document.addKeyword(Field.PORTLET_ID, PORTLET_ID);
		document.addKeyword(Field.GROUP_ID, groupId);
		document.addKeyword(Field.SCOPE_GROUP_ID, scopeGroupId);
		document.addKeyword(Field.USER_ID, userId);		
		document.addText(Field.USER_NAME, userName);
		document.addText(Field.TITLE, title);
		document.addText(Field.CONTENT, content);		
		document.addKeyword(Field.ENTRY_CLASS_NAME, SampleEntry.class.getName());
		document.addKeyword(Field.ENTRY_CLASS_PK, entryId);
		return document;
	}
	
	
	public void postProcessSearchQuery(BooleanQuery searchQuery,
			SearchContext searchContext) throws Exception {
		String title = (String) searchContext.getAttribute(Field.TITLE);
		if (Validator.isNotNull(title)) {
			if (searchContext.isAndSearch()) {
				searchQuery.addRequiredTerm("title", title, true);
			} else {
				searchQuery.addTerm("title", title, true);
			}
		}
		System.out.println("This is searchQuery = === " + searchQuery);
		String content = (String) searchContext.getAttribute(Field.CONTENT);
		if (Validator.isNotNull(content)) {
			if (searchContext.isAndSearch()) {
				searchQuery.addRequiredTerm("content", content, true);
			} else {
				searchQuery.addTerm("content", content, true);
			}
		}
		System.out.println("Search Query " + searchQuery.toString());
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale,
			String snippet, PortletURL portletURL) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("getSummary calling ");		
		String title = document.get(Field.TITLE);
		String content = snippet;
		if (Validator.isNull(snippet)) {
			content = StringUtil.shorten(document.get(Field.CONTENT), 200);
		}
		String entryId = document.get(Field.ENTRY_CLASS_PK);
		portletURL.setParameter("_spage", "/portlet_action/test/addView");
		portletURL.setParameter("urlType", "Action");
		portletURL.setParameter("entryId", entryId);
		return new Summary(title, content, portletURL);
	}

	@Override
	protected void doReindex(Object obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("doReindex calling ");
		SampleEntry entry = (SampleEntry)obj;		
		System.out.println(" document creation here");
		Document document = getDocument(entry);
		System.out.println("document is === "+document);		
		SearchEngineUtil.updateDocument(entry.getCompanyId(), document);
		System.out.println("updateDocument is === "+document);
		
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("doReindex calling ");
		SampleEntry entry = SampleEntryLocalServiceUtil.getSampleEntry((int) classPK);
		doReindex(entry);	
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("doReindex calling of string ");
		long companyId = GetterUtil.getLong(ids[0]);
		reindexEntries(companyId);	
		
	}
	
	protected void reindexEntries(long companyId) throws Exception {
		int count = SampleEntryLocalServiceUtil.getSampleEntriesCount();
		int pages = count / Indexer.DEFAULT_INTERVAL;
		for (int i = 0; i <= pages; i++) {
			int start = (i * Indexer.DEFAULT_INTERVAL);
			int end = start + Indexer.DEFAULT_INTERVAL;

			reindexEntries(companyId, start, end);
		}
	}	
	
	protected void reindexEntries(long companyId, int start, int end)
			throws Exception {
		List<SampleEntry> entries = SampleEntryLocalServiceUtil
				.getSampleEntries(0,
						SampleEntryLocalServiceUtil.getSampleEntriesCount());
		if (entries.isEmpty()) {
			return;
		}
		Collection<Document> documents = new ArrayList<Document>();
		for (SampleEntry entry : entries) {
			Document document = getDocument(entry);
			documents.add(document);
		}
		SearchEngineUtil.updateDocuments(companyId, documents);
	}
		

	@Override
	protected String getPortletId(SearchContext searchContext) {
		// TODO Auto-generated method stub
		System.out.println("getPortletId calling ");
		return PORTLET_ID;
	}

}
