create index IX_DEF88F6C on Sample_EntryComment (uuid_);
create index IX_EDD3D93C on Sample_EntryComment (uuid_, companyId);
create unique index IX_2FB97EBE on Sample_EntryComment (uuid_, groupId);

create index IX_DB97B2BB on Sample_SampleEntry (uuid_);
create index IX_D142DE8D on Sample_SampleEntry (uuid_, companyId);
create unique index IX_631BA44F on Sample_SampleEntry (uuid_, groupId);