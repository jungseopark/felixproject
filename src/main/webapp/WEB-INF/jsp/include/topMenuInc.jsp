<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="topMenuDiv">
	<ul>
		<c:forEach var="topMenu" items="${sessionVO.topMenuList}" varStatus="status">
			<li><c:out value='${topMenu.menuInfo.menuName}'/></li>
		</c:forEach>
	</ul>
</div>