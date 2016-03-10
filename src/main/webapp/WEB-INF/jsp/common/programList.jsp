<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>PROGRAM LIST</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#searchButton").click(function(){
		document.contentForm.action = "/common/selectProgramList.do";
		document.contentForm.submit();
	});
	$("#addButton").click(function(){
		document.contentForm.action = "/common/addProgram.do";
		document.contentForm.submit();
	});
});
</script>
</head>
<body>
<form:form name="contentForm" modelAttribute="searchVO" method="post">
<form:input id="searchName" path="searchName"/>
<input id="searchButton" type="button" value="조회">
<input id="addButton" type="button" value="신규">
<table>
	<thead>
		<tr>
			<th>아이디</th><th>프로그램명</th><th>설명</th><th>주소</th>
		</tr>
	</thead>
	<tbody>
	 <c:forEach var="result" items="${resultList}" varStatus="status">
	 	<tr>
		 	<td><c:out value="${result.programId}"/></td> 
		 	<td><c:out value="${result.name}"/></td>
		 	<td><c:out value="${result.description}"/></td>
		 	<td><c:out value="${result.url}"/></td>
		</tr>	
	 </c:forEach>
 	</tbody>
 	<tfoot>
		<tr>
			<th>아이디</th><th>프로그램명</th><th>설명</th><th>주소</th>
		</tr>
	</tfoot>
</table>
</form:form>
</body>
</html>