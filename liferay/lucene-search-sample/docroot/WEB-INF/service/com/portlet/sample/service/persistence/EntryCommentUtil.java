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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.portlet.sample.model.EntryComment;

import java.util.List;

/**
 * The persistence utility for the entry comment service. This utility wraps {@link EntryCommentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Scalsysu5
 * @see EntryCommentPersistence
 * @see EntryCommentPersistenceImpl
 * @generated
 */
public class EntryCommentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(EntryComment entryComment) {
		getPersistence().clearCache(entryComment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EntryComment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EntryComment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EntryComment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EntryComment update(EntryComment entryComment)
		throws SystemException {
		return getPersistence().update(entryComment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EntryComment update(EntryComment entryComment,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(entryComment, serviceContext);
	}

	/**
	* Returns all the entry comments where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.portlet.sample.model.EntryComment> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

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
	public static java.util.List<com.portlet.sample.model.EntryComment> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static java.util.List<com.portlet.sample.model.EntryComment> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first entry comment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first entry comment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last entry comment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last entry comment in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

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
	public static com.portlet.sample.model.EntryComment[] findByUuid_PrevAndNext(
		long commentId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence()
				   .findByUuid_PrevAndNext(commentId, uuid, orderByComparator);
	}

	/**
	* Removes all the entry comments where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of entry comments where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the entry comment where uuid = &#63; and groupId = &#63; or throws a {@link com.portlet.sample.NoSuchEntryCommentException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the entry comment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the entry comment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the entry comment where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the entry comment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of entry comments where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the entry comments where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.portlet.sample.model.EntryComment> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static java.util.List<com.portlet.sample.model.EntryComment> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static java.util.List<com.portlet.sample.model.EntryComment> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static com.portlet.sample.model.EntryComment findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first entry comment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

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
	public static com.portlet.sample.model.EntryComment findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last entry comment in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching entry comment, or <code>null</code> if a matching entry comment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static com.portlet.sample.model.EntryComment[] findByUuid_C_PrevAndNext(
		long commentId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(commentId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the entry comments where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of entry comments where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching entry comments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the entry comment in the entity cache if it is enabled.
	*
	* @param entryComment the entry comment
	*/
	public static void cacheResult(
		com.portlet.sample.model.EntryComment entryComment) {
		getPersistence().cacheResult(entryComment);
	}

	/**
	* Caches the entry comments in the entity cache if it is enabled.
	*
	* @param entryComments the entry comments
	*/
	public static void cacheResult(
		java.util.List<com.portlet.sample.model.EntryComment> entryComments) {
		getPersistence().cacheResult(entryComments);
	}

	/**
	* Creates a new entry comment with the primary key. Does not add the entry comment to the database.
	*
	* @param commentId the primary key for the new entry comment
	* @return the new entry comment
	*/
	public static com.portlet.sample.model.EntryComment create(long commentId) {
		return getPersistence().create(commentId);
	}

	/**
	* Removes the entry comment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commentId the primary key of the entry comment
	* @return the entry comment that was removed
	* @throws com.portlet.sample.NoSuchEntryCommentException if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment remove(long commentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence().remove(commentId);
	}

	public static com.portlet.sample.model.EntryComment updateImpl(
		com.portlet.sample.model.EntryComment entryComment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(entryComment);
	}

	/**
	* Returns the entry comment with the primary key or throws a {@link com.portlet.sample.NoSuchEntryCommentException} if it could not be found.
	*
	* @param commentId the primary key of the entry comment
	* @return the entry comment
	* @throws com.portlet.sample.NoSuchEntryCommentException if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment findByPrimaryKey(
		long commentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.portlet.sample.NoSuchEntryCommentException {
		return getPersistence().findByPrimaryKey(commentId);
	}

	/**
	* Returns the entry comment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param commentId the primary key of the entry comment
	* @return the entry comment, or <code>null</code> if a entry comment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.portlet.sample.model.EntryComment fetchByPrimaryKey(
		long commentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(commentId);
	}

	/**
	* Returns all the entry comments.
	*
	* @return the entry comments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.portlet.sample.model.EntryComment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.portlet.sample.model.EntryComment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.portlet.sample.model.EntryComment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the entry comments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of entry comments.
	*
	* @return the number of entry comments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EntryCommentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EntryCommentPersistence)PortletBeanLocatorUtil.locate(com.portlet.sample.service.ClpSerializer.getServletContextName(),
					EntryCommentPersistence.class.getName());

			ReferenceRegistry.registerReference(EntryCommentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EntryCommentPersistence persistence) {
	}

	private static EntryCommentPersistence _persistence;
}