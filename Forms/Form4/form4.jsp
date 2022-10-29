<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Form 4</h1>
	<hr><br>
	
	
	<form:form action="processForm4" modelAttribute="account1Model">
	
		<h3>Name: <form:input type="text" path="name" /> </h3>
		<h3>Email: <form:input type="email" path="email" /> </h3>
		<h3>Password: <form:input type="password" path="password" /> </h3>
		
		<input type="submit" value="Send" />
	
	</form:form>
	

</body>
</html>