create table Sample_EntryComment (
	uuid_ VARCHAR(75) null,
	commentId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	comment_ VARCHAR(75) null,
	classNameId LONG,
	classPK LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table Sample_SampleEntry (
	uuid_ VARCHAR(75) null,
	entryId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status BOOLEAN
);