create table FOO_CustomerService (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	title VARCHAR(75) null,
	price DOUBLE
);

create table FOO_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);

create table FOO_Offer (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	type_ VARCHAR(75) null,
	title VARCHAR(75) null,
	active_ BOOLEAN
);

create table FOO_OfferOption (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	offerId LONG,
	fullDuration LONG,
	discountDuration LONG,
	discountPrice LONG,
	fullPrice LONG,
	active_ BOOLEAN
);

create table FOO_Subscription (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	offerOptionId LONG,
	fromDate LONG,
	userId LONG
);