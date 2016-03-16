/* Sql Log */
create table TN_SQLLOG (
	LOG_SEQ  varchar(20) not null,
	LOG_LEVEL varchar(5) null,
	LOGGER varchar(100) null,
	QUERY text null,
	STAFF_NO varchar(20) null,
	IPADDRESS varchar(15) null,
	primary key(LOG_SEQ)
);

/* Method Log */
create table TN_METHODLOG (
	LOG_SEQ varchar(20) not null,
	CLASS_NAME varchar(100),
	METHOD_NAME varchar(100),
	STAFF_NO varchar(20),
	IPADDRESS varchar(15),
	primary key(LOG_SEQ)
);

/* Web Log */
create table TN_WEBLOG (
	LOG_SEQ varchar(20) not null,
	URL varchar(200),
	STAFF_NO varchar(20),
	IPADDRESS varchar(15),
	primary key(LOG_SEQ)
);

/* 로그인 사용자 */
create table TN_USER (
	USER_ID varchar(20) not null,
	STAFF_NO varchar(20) not null,
	USER_NAME varchar(100) not null,
	USER_PASSWORD varchar(255) not null,
	primary key(USER_ID)
);

/* 프로그램 */
create table TN_PROGRAM (
	PROGRAM_ID varchar(50) not null,
	PROGRAM_NAME varchar(100) not null,
	DESCRIPTION varchar(200) not null,
	URL varchar(200) not null,
	primary key(PROGRAM_ID)
);

/* 권한 */
create table TN_ROLE (
	ROLE_ID varchar(50) not null,
	ROLE_NAME varchar(100) not null,
	DESCRIPTION varchar(200)
	primary key(ROLE_ID)
);

/* 권한별 프로그램 */
create table TN_PROGRAM_ROLE (
	ROLE_ID varchar(50) not null,
	PROGRAM_ID varchar(50) not null
	primary key(ROLE_ID, PROGRAM_ID)
);

/* 사용자별 권한 */
create table TN_USER_ROLE (
	USER_ID varchar(20) not null,
	ROLE_ID varchar(50) not null
	primary key(USER_ID, ROLE_ID)
);