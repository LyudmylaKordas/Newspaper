<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="stylesheet" href="<c:url value='css/Site.css'/>" type="text/css" >
</head>
<body>
<div id="wrapper">
	<div id="header-wrapper">
		<tiles:insertAttribute name="header" />
	</div>

<div id="page">
		<div id="content">
		<tiles:insertAttribute name="body" />
		</div>
		
		<div id="sidebar">
		<tiles:insertAttribute name="sidebar" />
		</div>	
	<div style="clear: both;">&nbsp;</div>
</div>	
</div>
<div id="footer">
<tiles:insertAttribute name="footer" />
</div>
</body>
</html>