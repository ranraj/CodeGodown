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

package com.portlet.sample.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.portlet.sample.model.EntryComment;

/**
 * The persistence interface for the entry comment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Scalsysu5
 * @see EntryCommentPersistenceImpl
 * @see EntryCommentUtil
 * @generated
 */
public interface EntryCommentPersistence extends BasePersistence<EntryComment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EntryCommentUtil} to access the entry comment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the entry comments where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portlet.sample.model.EntryComment> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the entry comments where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.EntryCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of entry comments
	* @param end the upper bound of the range of entry comments (not inclusive)
	* @return the range of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portlet.sample.model.EntryComment> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the entry comments where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.EntryCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of entry comments
	* @param end the upper bound of the range of entry comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portlet.sample.model.EntryComment> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first entry comment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Returns the first entry comment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last entry comment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Returns the last entry comment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entry comments before and after the current entry comment in the ordered set where uuid = &#63;.
	*
	* @param commentId the primary key of the current entry comment
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment[] findByUuid_PrevAndNext(
		long commentId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Removes all the entry comments where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of entry comments where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entry comment where uuid = &#63; and groupId = &#63; or throws a {@link com.portlet.sample.NoSuchEntryCommentException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Returns the entry comment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entry comment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the entry comment where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the entry comment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Returns the number of entry comments where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the entry comments where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portlet.sample.model.EntryComment> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the entry comments where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.EntryCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of entry comments
	* @param end the upper bound of the range of entry comments (not inclusive)
	* @return the range of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portlet.sample.model.EntryComment> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the entry comments where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.EntryCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of entry comments
	* @param end the upper bound of the range of entry comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portlet.sample.model.EntryComment> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first entry comment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Returns the first entry comment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last entry comment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Returns the last entry comment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entry comments before and after the current entry comment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param commentId the primary key of the current entry comment
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment[] findByUuid_C_PrevAndNext(
		long commentId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Removes all the entry comments where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of entry comments where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the entry comment in the entity cache if it is enabled.
	*
	* @param entryComment the entry comment
	*/
	public void cacheResult(com.portlet.sample.model.EntryComment entryComment);

	/**
	* Caches the entry comments in the entity cache if it is enabled.
	*
	* @param entryComments the entry comments
	*/
	public void cacheResult(
		java.util.List<com.portlet.sample.model.EntryComment> entryComments);

	/**
	* Creates a new entry comment with the primary key. Does not add the entry comment to the database.
	*
	* @param commentId the primary key for the new entry comment
	* @return the new entry comment
	*/
	public com.portlet.sample.model.EntryComment create(long commentId);

	/**
	* Removes the entry comment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commentId the primary key of the entry comment
	* @return the entry comment that was removed
	* @throws com.portlet.sample.NoSuchEntryCommentException if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment remove(long commentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	public com.portlet.sample.model.EntryComment updateImpl(
		com.portlet.sample.model.EntryComment entryComment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the entry comment with the primary key or throws a {@link com.portlet.sample.NoSuchEntryCommentException} if it could not be found.
	*
	* @param commentId the primary key of the entry comment
	* @return the entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment findByPrimaryKey(
		long commentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException;

	/**
	* Returns the entry comment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param commentId the primary key of the entry comment
	* @return the entry comment, or <code>null</code> if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.portlet.sample.model.EntryComment fetchByPrimaryKey(
		long commentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the entry comments.
	*
	* @return the entry comments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portlet.sample.model.EntryComment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.portlet.sample.model.EntryComment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the entry comments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.EntryCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of entry comments
	* @param end the upper bound of the range of entry comments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of entry comments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.portlet.sample.model.EntryComment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the entry comments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of entry comments.
	*
	* @return the number of entry comments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}