-- 사용자
insert into TN_USER(USER_ID, STAFF_NO, USER_NAME, USER_PASSWORD)values('master','master','시스템관리자','356a192b7913b04c54574d18c28d46e6395428ab'); 
insert into TN_USER(USER_ID, STAFF_NO, USER_NAME, USER_PASSWORD)values('user','user','일반사용자','356a192b7913b04c54574d18c28d46e6395428ab'); 
-- 프로그램목록
insert into TN_PROGRAM(PROGRAM_ID, PROGRAM_NAME, DESCRIPTION, PROGRAM_URL)values('dir','디렉토리','디렉토리','/');
insert into TN_PROGRAM(PROGRAM_ID, PROGRAM_NAME, DESCRIPTION, PROGRAM_URL)values('NationCodeList','국가코드목록조회','국가코드목록조회','/');
-- 메뉴목록
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('0','root','0',0,0,'dir','최상단');
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('99000000000','내부시스템관리','0',1,99,'dir','내부시스템관리');
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('99000100000','코드관리','99000000000',3,1,'dir','코드관리');
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('99000101000','국가코드관리','99000100000',4,1,'dir','국가코드관리');
-- 권한 목록
insert into TN_ROLE(ROLE_ID, ROLE_NAME, DESCRIPTION)values('ROLE_USER','일반사용자','일반사용자');
insert into TN_ROLE(ROLE_ID, ROLE_NAME, DESCRIPTION)values('ROLE_ADMIN','시스템관리자','시스템관리자');
-- 사용자별 권한
insert into TN_USER_ROLE(USER_ID, ROLE_ID)values('master','ROLE_ADMIN');
insert into TN_USER_ROLE(USER_ID, ROLE_ID)values('user','ROLE_USER');
-- 권한별 메뉴
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_ADMIN', '99000000000');
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_ADMIN', '99000100000');
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_ADMIN', '99000101000');
