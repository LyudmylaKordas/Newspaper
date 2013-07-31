<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"> 
<html>
<head>

    <title>Edit advetisement</title>
    

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
   
	 //initiate validator on load
	   $(function() {
	   // validate contact form on keyup and submit
	   $("#editAdvertisementForm").validate({
	   //set the rules for the field names
	   rules: {
	   caption: {
	   required: true,
	   minlength: 2,
	   maxlength: 100
	   },
	   
	   userName: {
       required: true,
       minlength: 5,
	   maxlength: 50
       },
       
	   emailFeedback: {
	   required: true,
	   email: true
	   },
	   
	   phone: {
	   required: true,
	   minlength: 5,
	   maxlength: 15,
	   digits: true
	   },
	   
	   text: {
	   required: true,
	   maxlength: 500
	   },
	   }
	   });
	   });
   </script>


</head>
<body>
 
<h2>Edit advertisement</h2>
 
<form:form id="editAdvertisementForm" method="post" action="editAdvertisement.html" commandName="advertisement">
 
    <table>
    <tr>
        <td>Caption</td>
        <td>
        <form:input path="caption" />

        </td> 
    </tr>

    <tr>
        <td>Lastname and Firstname</td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
	    <td>Category</td>
	    <td>	
			<form:select path="category">
			    <form:options items="${categoryList}" itemValue="idCategory" itemLabel="category" />
			</form:select>
	    </td>
    </tr>
    <tr>
        <td>Email</td>
        <td><form:input path="emailFeedback" /></td>
    </tr>
    <tr>
        <td>Phone</td>
        <td><form:input path="phone" /></td>
    </tr>
    <tr>
        <td>Text</td>
        <td>
        <form:textarea path="text" />
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="editAvertisement"/>
        </td>
    </tr>
</table>  
</form:form>
 
</body>
</html>