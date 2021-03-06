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

package com.portlet.sample.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EntryComment service. Represents a row in the &quot;Sample_EntryComment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.portlet.sample.model.impl.EntryCommentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.portlet.sample.model.impl.EntryCommentImpl}.
 * </p>
 *
 * @author Scalsysu5
 * @see EntryComment
 * @see com.portlet.sample.model.impl.EntryCommentImpl
 * @see com.portlet.sample.model.impl.EntryCommentModelImpl
 * @generated
 */
public interface EntryCommentModel extends AttachedModel, BaseModel<EntryComment>,
	StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a entry comment model instance should use the {@link EntryComment} interface instead.
	 */

	/**
	 * Returns the primary key of this entry comment.
	 *
	 * @return the primary key of this entry comment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this entry comment.
	 *
	 * @param primaryKey the primary key of this entry comment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this entry comment.
	 *
	 * @return the uuid of this entry comment
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this entry comment.
	 *
	 * @param uuid the uuid of this entry comment
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the comment ID of this entry comment.
	 *
	 * @return the comment ID of this entry comment
	 */
	public long getCommentId();

	/**
	 * Sets the comment ID of this entry comment.
	 *
	 * @param commentId the comment ID of this entry comment
	 */
	public void setCommentId(long commentId);

	/**
	 * Returns the company ID of this entry comment.
	 *
	 * @return the company ID of this entry comment
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this entry comment.
	 *
	 * @param companyId the company ID of this entry comment
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this entry comment.
	 *
	 * @return the group ID of this entry comment
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this entry comment.
	 *
	 * @param groupId the group ID of this entry comment
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this entry comment.
	 *
	 * @return the user ID of this entry comment
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this entry comment.
	 *
	 * @param userId the user ID of this entry comment
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this entry comment.
	 *
	 * @return the user uuid of this entry comment
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this entry comment.
	 *
	 * @param userUuid the user uuid of this entry comment
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the comment of this entry comment.
	 *
	 * @return the comment of this entry comment
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this entry comment.
	 *
	 * @param comment the comment of this entry comment
	 */
	public void setComment(String comment);

	/**
	 * Returns the fully qualified class name of this entry comment.
	 *
	 * @return the fully qualified class name of this entry comment
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this entry comment.
	 *
	 * @return the class name ID of this entry comment
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this entry comment.
	 *
	 * @param classNameId the class name ID of this entry comment
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this entry comment.
	 *
	 * @return the class p k of this entry comment
	 */
	@Override
	public long getClassPK();

	/**
	 * Sets the class p k of this entry comment.
	 *
	 * @param classPK the class p k of this entry comment
	 */
	@Override
	public void setClassPK(long classPK);

	/**
	 * Returns the create date of this entry comment.
	 *
	 * @return the create date of this entry comment
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this entry comment.
	 *
	 * @param createDate the create date of this entry comment
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this entry comment.
	 *
	 * @return the modified date of this entry comment
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this entry comment.
	 *
	 * @param modifiedDate the modified date of this entry comment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(EntryComment entryComment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EntryComment> toCacheModel();

	@Override
	public EntryComment toEscapedModel();

	@Override
	public EntryComment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}