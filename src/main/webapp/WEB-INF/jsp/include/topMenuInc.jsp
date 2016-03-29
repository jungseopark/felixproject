<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script type="text/javascript">
function getSecondMenu(upperMenuId) {
	$(".secondMenuLi").remove();
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "<c:url value='/commons/auth/selectSecondMenuList.do'/>",
		data : {searchUpperMenuId : upperMenuId},
		success : function(data) {
			$.each(data.result, function(index, item){
				// 2단메뉴 위치지정
				var ulAppendId = "#" + item.menuInfo.upperMenuId;
				// 2단메뉴 내용생성
				var liAppendContext = "<li class='secondMenuLi'>";
				liAppendContext += "<a href='javascript:getThirdMenu(" + item.menuInfo.menuId + ");'>";
				liAppendContext += item.menuInfo.menuName;
				liAppendContext += "</a></li>";
				$(ulAppendId).append(liAppendContext);
			});
		}
	});
}

function getThirdMenu(menuId) {
	$("#searchUpperMenuId").val(menuId);
	$("#topMenuForm").attr({
		action : "<c:url value='/commons/auth/selectThirdMenuList.do'/>",
		method : "post"
	}).submit();
}
</script>
<form id="topMenuForm" name="topMenuForm" method="post">
<input type="hidden" id="searchUpperMenuId" name="searchUpperMenuId">
<div id="topMenuDiv">
	<ul id="topMenuUl">
		<c:forEach var="topMenu" items="${sessionVO.topMenuList}" varStatus="status">
			<li class="topMenuLi">
				<a href="javascript:getSecondMenu(<c:out value='${topMenu.menuInfo.menuId}'/>);">
					<c:out value='${topMenu.menuInfo.menuName}'/>
				</a>
				<ul id="<c:out value='${topMenu.menuInfo.menuId}'/>" class="secondMenuUl"></ul>
			</li>
		</c:forEach>
	</ul>
</div>
</form>