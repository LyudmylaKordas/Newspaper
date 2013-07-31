<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"> 
    <title>Register</title>
    
    <style>
		.error {
		color: red;
		font: 12pt verdana;
		padding-left: 10px
		}
    </style>
    
    <script type="text/javascript" src="scripts/jquery.js"  charset='windows-1251'></script>
    <script type="text/javascript" src="scripts/jquery.validate.js"  charset='windows-1251'></script>
    
   <script type="text/javascript"> 
   
	
	   $(function() {
	   $("#loginForm").validate({

	   rules: {
	   
	   login: {
	   required: true,
	   minlength: 5,
	   maxlength: 25
	   },
	   password: {
	   required: true
	   },

	   }
	   });
	   });
   </script>


</head>
<body>
 
<h2>Login</h2>
 
<form:form id="loginForm" method="post" action="login.html" commandName="user">
 
    <table>
    <tr>
        <td>Login</td>
        <td><form:input path="login" /></td> 
    </tr>

    <tr>
        <td>Password</td>
        <td><form:input type="password" path="password" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="login"/>
        </td>
    </tr>
</table>  
</form:form>
 
</body>
</html>