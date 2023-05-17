create index IX_9A6945B0 on FOO_CustomerService (uuid_[$COLUMN_LENGTH:75$]);

create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_AAAF512B on FOO_Offer (uuid_[$COLUMN_LENGTH:75$]);

create index IX_EF60276 on FOO_OfferOption (uuid_[$COLUMN_LENGTH:75$]);

create index IX_872313B8 on FOO_Subscription (uuid_[$COLUMN_LENGTH:75$]);