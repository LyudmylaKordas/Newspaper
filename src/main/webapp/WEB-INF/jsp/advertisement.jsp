<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"> 

<html>
<head>

<script type="text/javascript">
function confirmDelete(idAdvertisement) {
    var answer = confirm("Delete advertisement?");
    if(answer) {
        document.location.href="deleteAdvertisement/"+idAdvertisement+".html";
    }
}
 
</script>

    <title>GetByCategory</title>
    <link rel="stylesheet" href="<c:url value='css/Site.css'/>" type="text/css" >
</head>
<body>
<h3>Advertisement by category ${category.category}</h3>
<br />
<br />


	<c:if  test="${!empty advertisementList}">
	<c:forEach items="${advertisementList}" var="advertisement">	
	<ul id="listA"> 
		<li>
			<a href="detailsAdvertisementById/${advertisement.idAdvertisement}.html">${advertisement.caption}</a>			
		</li>
	</ul>
	&nbsp;&nbsp;&nbsp;<a href="javascript:void(0);" onclick="confirmDelete('${advertisement.idAdvertisement}');">delete</a>
	&nbsp;&nbsp;&nbsp;<a href="editAdvertisement/${advertisement.idAdvertisement}.html">edit</a>
	</c:forEach>
	</c:if>

</body>
