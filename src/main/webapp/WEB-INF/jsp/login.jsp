<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:import url="/WEB-INF/jsp/include/doctypeInc.jsp" />
<html lang="ko">
<head>
<c:import url="/WEB-INF/jsp/include/commonInc.jsp" />
<title>LogIn</title>
</head>
<body>
	<section>
	<form:form modelAttribute="loginVO" action="/common/actionLogIn.do">
		<article>
			<label>아이디 :</label>
			<form:input path="searchUserId"/>
			<label>패스워드 :</label>
			<form:password path="searchUserPassword"/>
			<button type="submit">로그인</button>
			<label>${message}</label>
		</article>
	</form:form>
	</section>
</body>
</html>