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
	   $("#registerForm").validate({

	   rules: {
	   firstName: {
	   required: true,
	   minlength: 5,
	   maxlength: 25
	   },
	   
	   lastName: {
       required: true,
       minlength: 5,
	   maxlength: 25
       },
	   
	   login: {
	   required: true,
	   minlength: 5,
	   maxlength: 25
	   },
	   password:{
		   required: true,
		   equalTo: '#pass'
	   },
	   
	   email: {
	   required: true,
	   email: true
	   },
	   
	   phone: {
	   required: true,
	   minlength: 5,
	   maxlength: 15,
	   digits: true
	   },

	   }
	   });
	   });
   </script>


</head>
<body>
 
<h2>Registration</h2>
 
<form:form id="registerForm" method="post" action="register.html" commandName="user">
 
    <table>
    <tr>
        <td>Firstname</td>
        <td><form:input path="firstName" /></td> 
    </tr>

    <tr>
        <td>Lastname</td>
        <td><form:input path="lastName" /></td>
    </tr>
    <tr>
	    <td>Login</td>	
		<td><form:input path="login" /></td>
    </tr>
    
    <tr>
	    <td>Password</td>	
		<td><form:input  type="password" path="password"/></td>
    </tr>
    <tr>
	    <td>Repeat password</td>	
		<td><input type="password" id="pass" /></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><form:input path="email"/></td>
    </tr>
    <tr>
        <td>Phone</td>
        <td><form:input path="phone" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Register"/>
        </td>
    </tr>
</table>  
</form:form>
 
</body>
</html>