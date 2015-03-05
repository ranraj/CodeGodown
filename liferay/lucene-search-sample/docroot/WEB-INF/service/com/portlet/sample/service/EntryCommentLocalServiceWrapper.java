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

package com.portlet.sample.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EntryCommentLocalService}.
 *
 * @author Scalsysu5
 * @see EntryCommentLocalService
 * @generated
 */
public class EntryCommentLocalServiceWrapper implements EntryCommentLocalService,
	ServiceWrapper<EntryCommentLocalService> {
	public EntryCommentLocalServiceWrapper(
		EntryCommentLocalService entryCommentLocalService) {
		_entryCommentLocalService = entryCommentLocalService;
	}

	/**
	* Adds the entry comment to the database. Also notifies the appropriate model listeners.
	*
	* @param entryComment the entry comment
	* @return the entry comment that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment addEntryComment(
		com.portlet.sample.model.EntryComment entryComment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.addEntryComment(entryComment);
	}

	/**
	* Creates a new entry comment with the primary key. Does not add the entry comment to the database.
	*
	* @param commentId the primary key for the new entry comment
	* @return the new entry comment
	*/
	@Override
	public com.portlet.sample.model.EntryComment createEntryComment(
		long commentId) {
		return _entryCommentLocalService.createEntryComment(commentId);
	}

	/**
	* Deletes the entry comment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commentId the primary key of the entry comment
	* @return the entry comment that was removed
	* @throws PortalException if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment deleteEntryComment(
		long commentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.deleteEntryComment(commentId);
	}

	/**
	* Deletes the entry comment from the database. Also notifies the appropriate model listeners.
	*
	* @param entryComment the entry comment
	* @return the entry comment that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment deleteEntryComment(
		com.portlet.sample.model.EntryComment entryComment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.deleteEntryComment(entryComment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entryCommentLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.EntryCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.EntryCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.portlet.sample.model.EntryComment fetchEntryComment(
		long commentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.fetchEntryComment(commentId);
	}

	/**
	* Returns the entry comment with the matching UUID and company.
	*
	* @param uuid the entry comment's UUID
	* @param companyId the primary key of the company
	* @return the matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment fetchEntryCommentByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.fetchEntryCommentByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the entry comment matching the UUID and group.
	*
	* @param uuid the entry comment's UUID
	* @param groupId the primary key of the group
	* @return the matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment fetchEntryCommentByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.fetchEntryCommentByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the entry comment with the primary key.
	*
	* @param commentId the primary key of the entry comment
	* @return the entry comment
	* @throws PortalException if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment getEntryComment(long commentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.getEntryComment(commentId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the entry comment with the matching UUID and company.
	*
	* @param uuid the entry comment's UUID
	* @param companyId the primary key of the company
	* @return the matching entry comment
	* @throws PortalException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment getEntryCommentByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.getEntryCommentByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the entry comment matching the UUID and group.
	*
	* @param uuid the entry comment's UUID
	* @param groupId the primary key of the group
	* @return the matching entry comment
	* @throws PortalException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment getEntryCommentByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.getEntryCommentByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the entry comments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.EntryCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entry comments
	* @param end the upper bound of the range of entry comments (not inclusive)
	* @return the range of entry comments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.portlet.sample.model.EntryComment> getEntryComments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.getEntryComments(start, end);
	}

	/**
	* Returns the number of entry comments.
	*
	* @return the number of entry comments
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEntryCommentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.getEntryCommentsCount();
	}

	/**
	* Updates the entry comment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entryComment the entry comment
	* @return the entry comment that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.portlet.sample.model.EntryComment updateEntryComment(
		com.portlet.sample.model.EntryComment entryComment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryCommentLocalService.updateEntryComment(entryComment);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _entryCommentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_entryCommentLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _entryCommentLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EntryCommentLocalService getWrappedEntryCommentLocalService() {
		return _entryCommentLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEntryCommentLocalService(
		EntryCommentLocalService entryCommentLocalService) {
		_entryCommentLocalService = entryCommentLocalService;
	}

	@Override
	public EntryCommentLocalService getWrappedService() {
		return _entryCommentLocalService;
	}

	@Override
	public void setWrappedService(
		EntryCommentLocalService entryCommentLocalService) {
		_entryCommentLocalService = entryCommentLocalService;
	}

	private EntryCommentLocalService _entryCommentLocalService;
}