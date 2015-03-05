package com.portlet.sample.searchcontainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.util.JavaConstants;
import com.portlet.sample.model.SampleEntry;

public class SampleEntrySearch extends SearchContainer<SampleEntry> {
	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	static {
		headerNames.add("user-name");
		headerNames.add("title");
		headerNames.add("content");

		orderableHeaders.put("user-name", "user-name");
		orderableHeaders.put("title", "title");
		orderableHeaders.put("content", "content");

	}

	public static final String EMPTY_RESULTS_MESSAGE = "no-entry-were-found";

	public SampleEntrySearch(PortletRequest portletRequest,
			PortletURL iteratorURL) {
		this(portletRequest, DEFAULT_CUR_PARAM, iteratorURL);
	}

	public SampleEntrySearch(PortletRequest portletRequest, String curParam,
			PortletURL iteratorURL) {
		// TODO Auto-generated constructor stub
		super(portletRequest, new SampleEntryDisplayTerm(portletRequest),
				new SampleEntrySearchTerm(portletRequest), curParam,
				DEFAULT_DELTA, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

		PortletConfig portletConfig = (PortletConfig) portletRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);

		SampleEntryDisplayTerm displayTerms = (SampleEntryDisplayTerm) getDisplayTerms();
		SampleEntrySearchTerm searchTerms = (SampleEntrySearchTerm) getSearchTerms();

		iteratorURL.setParameter(SampleEntryDisplayTerm.USER_NAME,
				displayTerms.getUserName());
		iteratorURL.setParameter(SampleEntryDisplayTerm.TITLE,
				displayTerms.getTitle());
		iteratorURL.setParameter(SampleEntryDisplayTerm.CONTENT,
				displayTerms.getContent());

	}

}
