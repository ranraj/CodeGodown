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

package com.portlet.sample.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.portlet.sample.model.EntryComment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EntryComment in entity cache.
 *
 * @author Scalsysu5
 * @see EntryComment
 * @generated
 */
public class EntryCommentCacheModel implements CacheModel<EntryComment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", commentId=");
		sb.append(commentId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", classNameId=");
		sb.append(classNameId);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EntryComment toEntityModel() {
		EntryCommentImpl entryCommentImpl = new EntryCommentImpl();

		if (uuid == null) {
			entryCommentImpl.setUuid(StringPool.BLANK);
		}
		else {
			entryCommentImpl.setUuid(uuid);
		}

		entryCommentImpl.setCommentId(commentId);
		entryCommentImpl.setCompanyId(companyId);
		entryCommentImpl.setGroupId(groupId);
		entryCommentImpl.setUserId(userId);

		if (comment == null) {
			entryCommentImpl.setComment(StringPool.BLANK);
		}
		else {
			entryCommentImpl.setComment(comment);
		}

		entryCommentImpl.setClassNameId(classNameId);
		entryCommentImpl.setClassPK(classPK);

		if (createDate == Long.MIN_VALUE) {
			entryCommentImpl.setCreateDate(null);
		}
		else {
			entryCommentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			entryCommentImpl.setModifiedDate(null);
		}
		else {
			entryCommentImpl.setModifiedDate(new Date(modifiedDate));
		}

		entryCommentImpl.resetOriginalValues();

		return entryCommentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		commentId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		comment = objectInput.readUTF();
		classNameId = objectInput.readLong();
		classPK = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(commentId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);

		if (comment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comment);
		}

		objectOutput.writeLong(classNameId);
		objectOutput.writeLong(classPK);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long commentId;
	public long companyId;
	public long groupId;
	public long userId;
	public String comment;
	public long classNameId;
	public long classPK;
	public long createDate;
	public long modifiedDate;
}