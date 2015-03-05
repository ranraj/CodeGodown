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
 * This class is a wrapper for {@link SampleEntry}.
 * </p>
 *
 * @author Scalsysu5
 * @see SampleEntry
 * @generated
 */
public class SampleEntryWrapper implements SampleEntry,
	ModelWrapper<SampleEntry> {
	public SampleEntryWrapper(SampleEntry sampleEntry) {
		_sampleEntry = sampleEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return SampleEntry.class;
	}

	@Override
	public String getModelClassName() {
		return SampleEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entryId", getEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
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

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this sample entry.
	*
	* @return the primary key of this sample entry
	*/
	@Override
	public long getPrimaryKey() {
		return _sampleEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sample entry.
	*
	* @param primaryKey the primary key of this sample entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sampleEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this sample entry.
	*
	* @return the uuid of this sample entry
	*/
	@Override
	public java.lang.String getUuid() {
		return _sampleEntry.getUuid();
	}

	/**
	* Sets the uuid of this sample entry.
	*
	* @param uuid the uuid of this sample entry
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_sampleEntry.setUuid(uuid);
	}

	/**
	* Returns the entry ID of this sample entry.
	*
	* @return the entry ID of this sample entry
	*/
	@Override
	public long getEntryId() {
		return _sampleEntry.getEntryId();
	}

	/**
	* Sets the entry ID of this sample entry.
	*
	* @param entryId the entry ID of this sample entry
	*/
	@Override
	public void setEntryId(long entryId) {
		_sampleEntry.setEntryId(entryId);
	}

	/**
	* Returns the company ID of this sample entry.
	*
	* @return the company ID of this sample entry
	*/
	@Override
	public long getCompanyId() {
		return _sampleEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this sample entry.
	*
	* @param companyId the company ID of this sample entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_sampleEntry.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this sample entry.
	*
	* @return the group ID of this sample entry
	*/
	@Override
	public long getGroupId() {
		return _sampleEntry.getGroupId();
	}

	/**
	* Sets the group ID of this sample entry.
	*
	* @param groupId the group ID of this sample entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_sampleEntry.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this sample entry.
	*
	* @return the user ID of this sample entry
	*/
	@Override
	public long getUserId() {
		return _sampleEntry.getUserId();
	}

	/**
	* Sets the user ID of this sample entry.
	*
	* @param userId the user ID of this sample entry
	*/
	@Override
	public void setUserId(long userId) {
		_sampleEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this sample entry.
	*
	* @return the user uuid of this sample entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sampleEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this sample entry.
	*
	* @param userUuid the user uuid of this sample entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_sampleEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this sample entry.
	*
	* @return the user name of this sample entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _sampleEntry.getUserName();
	}

	/**
	* Sets the user name of this sample entry.
	*
	* @param userName the user name of this sample entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_sampleEntry.setUserName(userName);
	}

	/**
	* Returns the title of this sample entry.
	*
	* @return the title of this sample entry
	*/
	@Override
	public java.lang.String getTitle() {
		return _sampleEntry.getTitle();
	}

	/**
	* Sets the title of this sample entry.
	*
	* @param title the title of this sample entry
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_sampleEntry.setTitle(title);
	}

	/**
	* Returns the content of this sample entry.
	*
	* @return the content of this sample entry
	*/
	@Override
	public java.lang.String getContent() {
		return _sampleEntry.getContent();
	}

	/**
	* Sets the content of this sample entry.
	*
	* @param content the content of this sample entry
	*/
	@Override
	public void setContent(java.lang.String content) {
		_sampleEntry.setContent(content);
	}

	/**
	* Returns the create date of this sample entry.
	*
	* @return the create date of this sample entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _sampleEntry.getCreateDate();
	}

	/**
	* Sets the create date of this sample entry.
	*
	* @param createDate the create date of this sample entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_sampleEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this sample entry.
	*
	* @return the modified date of this sample entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _sampleEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this sample entry.
	*
	* @param modifiedDate the modified date of this sample entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_sampleEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this sample entry.
	*
	* @return the status of this sample entry
	*/
	@Override
	public boolean getStatus() {
		return _sampleEntry.getStatus();
	}

	/**
	* Returns <code>true</code> if this sample entry is status.
	*
	* @return <code>true</code> if this sample entry is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _sampleEntry.isStatus();
	}

	/**
	* Sets whether this sample entry is status.
	*
	* @param status the status of this sample entry
	*/
	@Override
	public void setStatus(boolean status) {
		_sampleEntry.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _sampleEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sampleEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sampleEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sampleEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sampleEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sampleEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sampleEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sampleEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sampleEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sampleEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sampleEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SampleEntryWrapper((SampleEntry)_sampleEntry.clone());
	}

	@Override
	public int compareTo(com.portlet.sample.model.SampleEntry sampleEntry) {
		return _sampleEntry.compareTo(sampleEntry);
	}

	@Override
	public int hashCode() {
		return _sampleEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.portlet.sample.model.SampleEntry> toCacheModel() {
		return _sampleEntry.toCacheModel();
	}

	@Override
	public com.portlet.sample.model.SampleEntry toEscapedModel() {
		return new SampleEntryWrapper(_sampleEntry.toEscapedModel());
	}

	@Override
	public com.portlet.sample.model.SampleEntry toUnescapedModel() {
		return new SampleEntryWrapper(_sampleEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sampleEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sampleEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sampleEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SampleEntryWrapper)) {
			return false;
		}

		SampleEntryWrapper sampleEntryWrapper = (SampleEntryWrapper)obj;

		if (Validator.equals(_sampleEntry, sampleEntryWrapper._sampleEntry)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _sampleEntry.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SampleEntry getWrappedSampleEntry() {
		return _sampleEntry;
	}

	@Override
	public SampleEntry getWrappedModel() {
		return _sampleEntry;
	}

	@Override
	public void resetOriginalValues() {
		_sampleEntry.resetOriginalValues();
	}

	private SampleEntry _sampleEntry;
}