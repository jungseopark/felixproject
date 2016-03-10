<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Program Regist</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#insertButton").click(function(){
		document.contentForm.action = "/common/insertProgram.do";
		document.contentForm.submit();
	});
});
</script>
</head>
<body>
<form:form name="contentForm" modelAttribute="searchVO" method="post">
	<form:hidden path="searchName"/><br>
	# program id : <form:input path="programId"/><br>
	# name : <form:input path="name"/><br>
	# description : <form:input path="description"/><br>
	# url : <form:input path="url"/><br>
	<input id="insertButton" type="button" value="저장">
</form:form>
</body>
</html>