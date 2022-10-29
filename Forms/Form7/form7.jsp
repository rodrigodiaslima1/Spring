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

	<h1>Form 7</h1>
	<hr><br>
	
	<form:form action="processForm7" modelAttribute="candidate1Model" >
		
		<h3>Name: <form:input path="name" /> </h3>
		<h3>Surname: <form:input path="surname" /></h3>
		<h3>Country: 
			<form:select path="country">
				<form:options items="${candidate1Model.countries}" />
			</form:select>
		</h3>
		
		<h3>Programming Language:</h3>
			<h4>
				Java <form:radiobutton path="language" value="Java" />
				Python <form:radiobutton path="language" value="Python" />
				JavaScript <form:radiobutton path="language" value="JavaScript" />
				C# <form:radiobutton path="language" value="C#" />
			</h4>
			
		<h3>Back-end Framework:</h3>
			<h4>
				SpringFramework <form:radiobutton path="framework" value="Spring Framework" />
				Django <form:radiobutton path="framework" value="Django" />
				Node.JS <form:radiobutton path="framework" value="nodeJS" />
				.NET <form:radiobutton path="framework" value=".NET" />
			</h4>
		
		<input type="submit" value="Send" />
		
	
	</form:form>

</body>
</html>