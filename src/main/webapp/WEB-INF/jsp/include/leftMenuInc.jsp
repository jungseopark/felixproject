<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script type="text/javascript">
function getFourthMenu(upperMenuId) {
	$(".fourthMenuLi").remove();
	$.ajax({
		type : "POST",
		dataType : "json",
		url : "<c:url value='/commons/auth/selectFourthMenuList.do'/>",
		data : {searchUpperMenuId : upperMenuId},
		success : function(data) {
			$.each(data.result, function(index, item){
				// 4단메뉴 위치지정
				var ulAppendId = "#" + item.menuInfo.upperMenuId;
				// 4단메뉴 내용생성
				var liAppendContext = "<li class='forthMenuLi'>";
				liAppendContext += "<a href='" + item.programInfo.programUrl + "'>";
				liAppendContext += item.menuInfo.menuName;
				liAppendContext += "</a></li>";
				$(ulAppendId).append(liAppendContext);
			});
		}
	});
}

</script>

<div id="leftMenuDiv">
	<ul id="leftMenuUl">
		<c:forEach var="leftMenu" items="${thirdMenuList}" varStatus="status">
			<li class="leftMenuLi">
				<a href="javascript:getFourthMenu(<c:out value='${leftMenu.menuInfo.menuId}'/>);">
					<c:out value='${leftMenu.menuInfo.menuName}'/>
				</a>
				<ul id="<c:out value='${leftMenu.menuInfo.menuId}'/>" class="thirdMenuUl"></ul>
			</li>
		</c:forEach>
	</ul>
</div>
