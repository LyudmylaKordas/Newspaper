<%@ include file="/WEB-INF/jsp/include.jsp" %>

<%@page contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"> 


<html>
<head>
    <title>Categories</title>
</head>


<body>
 
<h2>Choose category:</h2>
<br />
<br />

<ul id="listA"> 
	<c:if  test="${!empty categoryList}">
	<c:forEach items="${categoryList}" var="category">
		<li><a href="advertisementByCategory/${category.idCategory}.html">${category.category}</a></li>
	</c:forEach>
	</c:if>
</ul>

</body>
</html>