<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="felixproject.message-common"/>
<fmt:setLocale value="en"/>
<!DOCTYPE html>
<html>
<head>
<title>WEB LOG PAGE</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th><fmt:message key="title.writeDateTime"/></th><th>경로</th><th>접속아이디</th><th>아이피주소</th>
		</tr>
	</thead>
	<tbody>
	 <c:forEach var="result" items="${resultList}" varStatus="status">
	 	<tr>
		 	<td><c:out value="${result.logSeq}"/></td> 
		 	<td><c:out value="${result.url}"/></td>
		 	<td><c:out value="${result.staffNo}"/></td>
		 	<td><c:out value="${result.ipAddress}"/></td>
		</tr>	
	 </c:forEach>
 	</tbody>
</table>
</body>
</html>