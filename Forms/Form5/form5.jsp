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

	<h1>Form 5</h1>
	<hr><br>
	
	<form:form action="processForm5" modelAttribute="person1Model">
	
		<h3>Name: <form:input path="name"/> </h3>
		
		<h3>Country:
			<form:select path="country">
				<form:option value="Brazil" label="Brazil" />
				<form:option value="England" label="England" />
			</form:select>
		</h3>
		
		<input type="submit" value="Send" />
	
	</form:form>

</body>
</html>