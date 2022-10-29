
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Form 8</h1>
	<hr><br>
	
	<form:form action="processForm8" modelAttribute="candidate2Model" >
	
		<h3>Name: <form:input path="name" /> </h3>
		<h3>Surname: <form:input path="surname" /> </h3>
		<h3>Country: 
			<form:select path="country">
				<form:options items="${candidate2Model.countries}" />
			</form:select>
		</h3>		
		<h3>Language and Framework:</h3>
			<h4>
				Java/Spring <form:radiobutton path="language" value="Java" />
				Python/Django <form:radiobutton path="language" value="Python" />
				Javascript/NodeJS <form:radiobutton path="language" value="Javascript" />
				C#/.NET <form:radiobutton path="language" value="C#" />
			</h4>		
		<h3>Operating Systems:</h3>
		<h4>
			Linux <form:checkbox path="operatingSystems" value="Linux" />
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
			MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
		</h4>

		
		<input type="submit" value="Send" />
	
	</form:form>

</body>
</html>