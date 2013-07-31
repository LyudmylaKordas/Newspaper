<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"> 

<html>
<head>

    <title>GetByCategory</title>
    <link rel="stylesheet" href="<c:url value='css/Site.css'/>" type="text/css" >
</head>
<body>
<h3>Advertisement</h3>
<br />
<br />
<br />

 <h1>${advertisement.caption}</h1>
 <br />
 <h3>Category:   ${category.category}</h3>
 <br />
 <fieldset><font style="font-family: 'Arial Black'; font-size: large; font-style: italic; font-variant: normal; color: #003399;">${advertisement.text}</font> </fieldset>
<table id="table-2">
    <thead>
<tr>
  <th>Date</th>
  <th>User</th>
  <th>Phone</th>
  <th>Email</th>
</tr> 
</thead>
<tbody>
<tr>
    <td>
    ${advertisement.date}
     </td>
     <td>
    ${advertisement.userName}
    </td>
    <td>
    ${advertisement.phone}
    </td>
    <td>
    ${advertisement.emailFeedback}
    </td>
 </tr>
 </tbody>
 </table>
  <br />


<ul id="listA"> 
	<c:if  test="${!empty advertisementList}">
	<c:forEach items="${advertisementList}" var="advertisement">	
		<li><a href="detailsAdvertisement/${advertisement.idAdvertisement}.html">${advertisement.caption}<span><img src="css/banners/${advertisement.caption}.jpg" width="270" /></span></a></li>
	</c:forEach>
	</c:if>
</ul>
</body>