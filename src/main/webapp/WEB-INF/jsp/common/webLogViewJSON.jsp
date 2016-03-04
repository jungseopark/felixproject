<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="felixproject.message-common"/>
<!DOCTYPE html>
<html>
<head>
<title>WEB LOG JSON PAGE</title>
<script src="<c:url value='/scripts/js/jquery/datatable/jquery.dataTables.min.js'/>"></script>
<link rel="stylesheet" type="text/css" href="<c:url value='/scripts/js/jquery/datatable/jquery.dataTables.css'/>">
<script>
$(document).ready(function(){
	 $('#tableList').dataTable({
		 "searching" : false,
		 "ajax" : {
			 "url" : "/common/selectWebLogListJSON.do",
			 "type" : "post",
			 "datatype" : "json"
		 },
		 "columns" : [
		              {"data" : "logSeq"},
		              {"data" : "url"},
		              {"data" : "staffNo"},
		              {"data" : "ipAddress"}
		              ]
	 });
});
</script>
</head>
<body>
<table id="tableList" width="100%">
	<thead>
		<tr>
			<th><fmt:message key="title.writeDateTime"/></th><th>경로</th><th>접속아이디</th><th>아이피주소</th>
		</tr>
	</thead>
</table>
</body>
</html>