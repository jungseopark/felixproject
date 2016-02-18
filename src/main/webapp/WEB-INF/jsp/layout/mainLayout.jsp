<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>

<page:applyDecorator name="doctypeInc"/>
<html lang="ko">
<head>
<page:applyDecorator name="commonInc"/>
<title><decorator:title /></title>
<decorator:head />
</head>
<body>
	<div id="wrapper">
		<header><page:applyDecorator name="headerInc"/></header>
		<nav><page:applyDecorator name="topMenuInc"/></nav>
		<section>
			<aside><page:applyDecorator name="leftMenuInc"/></aside>
			<article>
				<decorator:body />
			</article>
		</section>
		<footer><page:applyDecorator name="footerInc"/></footer>
	</div>
</body>
</html>