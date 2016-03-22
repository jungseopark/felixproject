-- 사용자
insert into TN_USER(USER_ID, STAFF_NO, USER_NAME, USER_PASSWORD)values('master','master','시스템관리자','356a192b7913b04c54574d18c28d46e6395428ab'); 
insert into TN_USER(USER_ID, STAFF_NO, USER_NAME, USER_PASSWORD)values('user','user','일반사용자','356a192b7913b04c54574d18c28d46e6395428ab'); 
-- 프로그램목록
insert into TN_PROGRAM(PROGRAM_ID, PROGRAM_NAME, DESCRIPTION, PROGRAM_URL)values('dir','디렉토리','디렉토리','/');
-- 메뉴목록
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('0','root','0',0,0,'dir','최상단');
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('1000000000','1단메뉴1','0',1,1,'dir','1단메뉴1');
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('2000000000','1단메뉴2','0',1,2,'dir','1단메뉴2');
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('3000000000','1단메뉴3','0',1,3,'dir','1단메뉴3');
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('4000000000','1단메뉴4','0',1,4,'dir','1단메뉴4');
insert into TN_MENU(MENU_ID, MENU_NAME, UPPER_MENU_ID, MENU_LEVEL, MENU_ORDER, PROGRAM_ID, DESCRIPTION)values('5000000000','1단메뉴5','0',1,5,'dir','1단메뉴5');
-- 권한 목록
insert into TN_ROLE(ROLE_ID, ROLE_NAME, DESCRIPTION)values('ROLE_USER','일반사용자','일반사용자');
insert into TN_ROLE(ROLE_ID, ROLE_NAME, DESCRIPTION)values('ROLE_ADMIN','시스템관리자','시스템관리자');
-- 사용자별 권한
insert into TN_USER_ROLE(USER_ID, ROLE_ID)values('master','ROLE_ADMIN');
insert into TN_USER_ROLE(USER_ID, ROLE_ID)values('user','ROLE_USER');
-- 권한별 메뉴
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_ADMIN', '1000000000');
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_ADMIN', '2000000000');
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_ADMIN', '3000000000');
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_ADMIN', '4000000000');
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_ADMIN', '5000000000');
insert into TN_ROLE_MENU(ROLE_ID, MENU_ID)values('ROLE_USER', '1000000000');
