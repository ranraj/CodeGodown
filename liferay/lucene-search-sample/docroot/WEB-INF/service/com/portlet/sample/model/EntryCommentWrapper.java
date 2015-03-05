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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntryComment}.
 * </p>
 *
 * @author Scalsysu5
 * @see EntryComment
 * @generated
 */
public class EntryCommentWrapper implements EntryComment,
	ModelWrapper<EntryComment> {
	public EntryCommentWrapper(EntryComment entryComment) {
		_entryComment = entryComment;
	}

	@Override
	public Class<?> getModelClass() {
		return EntryComment.class;
	}

	@Override
	public String getModelClassName() {
		return EntryComment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("commentId", getCommentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("comment", getComment());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long commentId = (Long)attributes.get("commentId");

		if (commentId != null) {
			setCommentId(commentId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this entry comment.
	*
	* @return the primary key of this entry comment
	*/
	@Override
	public long getPrimaryKey() {
		return _entryComment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this entry comment.
	*
	* @param primaryKey the primary key of this entry comment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_entryComment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this entry comment.
	*
	* @return the uuid of this entry comment
	*/
	@Override
	public java.lang.String getUuid() {
		return _entryComment.getUuid();
	}

	/**
	* Sets the uuid of this entry comment.
	*
	* @param uuid the uuid of this entry comment
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_entryComment.setUuid(uuid);
	}

	/**
	* Returns the comment ID of this entry comment.
	*
	* @return the comment ID of this entry comment
	*/
	@Override
	public long getCommentId() {
		return _entryComment.getCommentId();
	}

	/**
	* Sets the comment ID of this entry comment.
	*
	* @param commentId the comment ID of this entry comment
	*/
	@Override
	public void setCommentId(long commentId) {
		_entryComment.setCommentId(commentId);
	}

	/**
	* Returns the company ID of this entry comment.
	*
	* @return the company ID of this entry comment
	*/
	@Override
	public long getCompanyId() {
		return _entryComment.getCompanyId();
	}

	/**
	* Sets the company ID of this entry comment.
	*
	* @param companyId the company ID of this entry comment
	*/
	@Override
	public void setCompanyId(long companyId) {
		_entryComment.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this entry comment.
	*
	* @return the group ID of this entry comment
	*/
	@Override
	public long getGroupId() {
		return _entryComment.getGroupId();
	}

	/**
	* Sets the group ID of this entry comment.
	*
	* @param groupId the group ID of this entry comment
	*/
	@Override
	public void setGroupId(long groupId) {
		_entryComment.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this entry comment.
	*
	* @return the user ID of this entry comment
	*/
	@Override
	public long getUserId() {
		return _entryComment.getUserId();
	}

	/**
	* Sets the user ID of this entry comment.
	*
	* @param userId the user ID of this entry comment
	*/
	@Override
	public void setUserId(long userId) {
		_entryComment.setUserId(userId);
	}

	/**
	* Returns the user uuid of this entry comment.
	*
	* @return the user uuid of this entry comment
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entryComment.getUserUuid();
	}

	/**
	* Sets the user uuid of this entry comment.
	*
	* @param userUuid the user uuid of this entry comment
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_entryComment.setUserUuid(userUuid);
	}

	/**
	* Returns the comment of this entry comment.
	*
	* @return the comment of this entry comment
	*/
	@Override
	public java.lang.String getComment() {
		return _entryComment.getComment();
	}

	/**
	* Sets the comment of this entry comment.
	*
	* @param comment the comment of this entry comment
	*/
	@Override
	public void setComment(java.lang.String comment) {
		_entryComment.setComment(comment);
	}

	/**
	* Returns the fully qualified class name of this entry comment.
	*
	* @return the fully qualified class name of this entry comment
	*/
	@Override
	public java.lang.String getClassName() {
		return _entryComment.getClassName();
	}

	@Override
	public void setClassName(java.lang.String className) {
		_entryComment.setClassName(className);
	}

	/**
	* Returns the class name ID of this entry comment.
	*
	* @return the class name ID of this entry comment
	*/
	@Override
	public long getClassNameId() {
		return _entryComment.getClassNameId();
	}

	/**
	* Sets the class name ID of this entry comment.
	*
	* @param classNameId the class name ID of this entry comment
	*/
	@Override
	public void setClassNameId(long classNameId) {
		_entryComment.setClassNameId(classNameId);
	}

	/**
	* Returns the class p k of this entry comment.
	*
	* @return the class p k of this entry comment
	*/
	@Override
	public long getClassPK() {
		return _entryComment.getClassPK();
	}

	/**
	* Sets the class p k of this entry comment.
	*
	* @param classPK the class p k of this entry comment
	*/
	@Override
	public void setClassPK(long classPK) {
		_entryComment.setClassPK(classPK);
	}

	/**
	* Returns the create date of this entry comment.
	*
	* @return the create date of this entry comment
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _entryComment.getCreateDate();
	}

	/**
	* Sets the create date of this entry comment.
	*
	* @param createDate the create date of this entry comment
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_entryComment.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this entry comment.
	*
	* @return the modified date of this entry comment
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _entryComment.getModifiedDate();
	}

	/**
	* Sets the modified date of this entry comment.
	*
	* @param modifiedDate the modified date of this entry comment
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_entryComment.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _entryComment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_entryComment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _entryComment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_entryComment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _entryComment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _entryComment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_entryComment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _entryComment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_entryComment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_entryComment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_entryComment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EntryCommentWrapper((EntryComment)_entryComment.clone());
	}

	@Override
	public int compareTo(EntryComment entryComment) {
		return _entryComment.compareTo(entryComment);
	}

	@Override
	public int hashCode() {
		return _entryComment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<EntryComment> toCacheModel() {
		return _entryComment.toCacheModel();
	}

	@Override
	public EntryComment toEscapedModel() {
		return new EntryCommentWrapper(_entryComment.toEscapedModel());
	}

	@Override
	public EntryComment toUnescapedModel() {
		return new EntryCommentWrapper(_entryComment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _entryComment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _entryComment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_entryComment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EntryCommentWrapper)) {
			return false;
		}

		EntryCommentWrapper entryCommentWrapper = (EntryCommentWrapper)obj;

		if (Validator.equals(_entryComment, entryCommentWrapper._entryComment)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _entryComment.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public EntryComment getWrappedEntryComment() {
		return _entryComment;
	}

	@Override
	public EntryComment getWrappedModel() {
		return _entryComment;
	}

	@Override
	public void resetOriginalValues() {
		_entryComment.resetOriginalValues();
	}

	private EntryComment _entryComment;
}