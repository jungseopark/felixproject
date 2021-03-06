create table TN_SQL_LOG (
	LOG_SEQ  varchar(20) not null,
	LOG_LEVEL varchar(5),
	LOGGER varchar(100),
	LOG_QUERY text not null,
	STAFF_NO varchar(20),
	IP_ADDRESS varchar(15) not null,
	primary key(LOG_SEQ)
);

create table TN_METHOD_LOG (
	LOG_SEQ varchar(20) not null,
	CLASS_NAME varchar(100) not null,
	METHOD_NAME varchar(100) not null,
	STAFF_NO varchar(20),
	IP_ADDRESS varchar(15) not null,
	primary key(LOG_SEQ)
);

create table TN_WEB_LOG (
	LOG_SEQ varchar(20) not null,
	URL varchar(200) not null,
	STAFF_NO varchar(20),
	IP_ADDRESS varchar(15) not null,
	primary key(LOG_SEQ)
);

create table TN_USER (
	USER_ID varchar(20) not null,
	STAFF_NO varchar(20) not null,
	USER_NAME varchar(100) not null,
	USER_PASSWORD varchar(255) not null,
	primary key(USER_ID)
);

create table TN_PROGRAM (
	PROGRAM_ID varchar(50) not null,
	PROGRAM_NAME varchar(100) not null,
	DESCRIPTION varchar(200),
	PROGRAM_URL varchar(200) not null,
	primary key(PROGRAM_ID)
);

create table TN_MENU (
	MENU_ID varchar(50) not null,
	MENU_NAME varchar(100) not null,
	UPPER_MENU_ID varchar(50) not null,
	MENU_LEVEL integer not null,
	MENU_ORDER integer not null,
	PROGRAM_ID varchar(50) not null,
	DESCRIPTION varchar(200),
	primary key(MENU_ID)
);

create table TN_ROLE (
	ROLE_ID varchar(50) not null,
	ROLE_NAME varchar(100) not null,
	DESCRIPTION varchar(200),
	primary key(ROLE_ID)
);

create table TN_USER_ROLE (
	USER_ID varchar(20) not null,
	ROLE_ID varchar(50) not null,
	primary key(USER_ID, ROLE_ID)
);

create table TN_ROLE_MENU (
	ROLE_ID varchar(50) not null,
	MENU_ID varchar(50) not null,
	primary key(ROLE_ID, MENU_ID)
);

create table TC_NATION (
	NATION_CODE varchar(3) not null,
	NATION_NAME_KOREA varchar(255) not null,
	NATION_NAME_ENGLISH varchar(255),
	CONTINENT_CODE varchar(20) not null,
	primary key(NATION_CODE)
);

