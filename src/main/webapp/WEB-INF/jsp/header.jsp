<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"> 
<link rel="stylesheet" href="<c:url value='css/Site.css'/>" type="text/css" >

		<div id="header" class="container">
			<div id="logindisplay ">
					
			        &nbsp;&nbsp;&nbsp;&nbsp;
			        <c:if  test="${!empty usrSession}">
						<text>Wellcome ${usrSession}!
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="<c:url value='/logout.html'/>">logout</a>
					</c:if>
					<c:if  test="${empty usrSession}">
			        	<a href="<c:url value='/login.html'/>">login</a>
			        	&nbsp;&nbsp;&nbsp;&nbsp;
				    	<a href="<c:url value='/register.html'/>">Registration</a>
					</c:if>

                    
         
			</div>
                         
             
			<div id="menu">
				<ul>
				
				    <li class="current_page_item"><a href="<c:url value='/category.html'/>">Main page</a></li>
              
					<li><a href="<c:url value='/addAdvertisement.html'/>">Add advertisement</a></li>
				</ul>
			</div>
		</div>
		<div id="banner">
			<div class="content"><img src="css/images/img02.jpg" width="1000" height="400" alt="" /></div>
		</div>
