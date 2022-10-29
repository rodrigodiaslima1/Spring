
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form 9</title>
<style>
	.error{color: red}
</style>
</head>
<body>

	<h1>Form 9</h1>
	<hr><br>
	
	<form:form action="processForm9" modelAttribute="customerModel" >
	
		<h3>First Name: <form:input path="firstName" /> </h3>
		<form:errors path="firstName" cssClass="error" />
		
		<h3>Last Name*: <form:input path="lastName" /> </h3>
		<form:errors path="lastName" cssClass="error" />
		
		<input type="submit" value="Send" />
	
	</form:form>
	
	<!-- 	
	<form action="processForm9" method="get" >
	
		<h3>First Name: <input type="text" name="userFirstName" placeholder="First Name" /></h3>
		<h3>Last Name: <input type="text" name="userLastName" placeholder="Last Name"/> </h3>
		
		<input type="submit" value="Send" />
	</form> 
	-->
	
	

</body>
</html>