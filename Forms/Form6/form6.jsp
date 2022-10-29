<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Form 6</h1>
	<hr><br>
	
	<form:form action="processForm6" modelAttribute="user1Model">
	
		<h3>Name: <form:input path="name" /> </h3>
		<h3>Surname: <form:input path="surname" /> </h3>
		<h3>Email: <form:input path="email" /> </h3>
		<h3>Password: <form:input path="password" /> </h3>
		<h3>Country: 
		
			<form:select path="country">
				<form:options items="${user1Model.countryOptions}" />
			</form:select>
			
		</h3>
		
		<input type="submit" value="Send" />
	
	</form:form>

</body>
</html>