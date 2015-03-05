/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.portlet.sample.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.bookmarks.model.BookmarksEntry;
import com.portlet.sample.model.SampleEntry;
import com.portlet.sample.service.base.SampleEntryLocalServiceBaseImpl;

/**
 * The implementation of the sample entry local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.portlet.sample.service.SampleEntryLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Scalsysu5
 * @see com.portlet.sample.service.base.SampleEntryLocalServiceBaseImpl
 * @see com.portlet.sample.service.SampleEntryLocalServiceUtil
 */
public class SampleEntryLocalServiceImpl extends
		SampleEntryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.portlet.sample.service.SampleEntryLocalServiceUtil} to access the
	 * sample entry local service.
	 */

	@Override
	@Indexable(type = IndexableType.REINDEX)
	public SampleEntry addEntry(long userId, long groupId, String name,
			String title, String content, ServiceContext serviceContext)
			throws PortalException, SystemException {

		Date now = new Date();

		User user = userPersistence.findByPrimaryKey(userId);

		long entryId = counterLocalService.increment();
		SampleEntry entry = sampleEntryPersistence.create(entryId);
		entry.setUuid(serviceContext.getUuid());
		entry.setCreateDate(serviceContext.getCreateDate(now));
		entry.setModifiedDate(serviceContext.getCreateDate(now));
		entry.setTitle(title);
		entry.setContent(content);
		entry.setUserId(user.getUserId());
		entry.setCompanyId(user.getCompanyId());
		entry.setGroupId(groupId);
		entry.setUserName(name);
		entry.setExpandoBridgeAttributes(serviceContext);
		sampleEntryPersistence.update(entry);
		return entry;
	}

	@Override
	public Hits search(long companyId, String title, String content, int start,
			int end) throws PortalException, SystemException {

		Indexer indexer = IndexerRegistryUtil.getIndexer(SampleEntry.class
				.getName());
		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(companyId);
		searchContext.setStart(start);
		searchContext.setEnd(end);
		searchContext.setAttribute(Field.TITLE, title);
		searchContext.setAttribute(Field.CONTENT, content);
		return indexer.search(searchContext);

	}

}