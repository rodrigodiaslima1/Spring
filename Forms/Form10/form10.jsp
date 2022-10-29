
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form 10</title>
<style>.error{color: red}</style>
</head>
<body>

	<h1>Form 10</h1>
	<hr><br>
	
	<em>Fill out the form. Asterisk (*) means required</em>
	<form:form action="processForm10" modelAttribute="customer2Model" >
	
		<h3>First Name: <form:input path="firstName" /> </h3>
		<form:errors path="firstName" cssClass="error" />
		
		<h3>Last Name*: <form:input path="lastName" /> </h3>
	
		<input type="submit" value="Send" />
	
	</form:form>

</body>
</html>