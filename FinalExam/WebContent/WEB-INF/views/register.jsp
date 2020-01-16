<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1 align="center">Register:</h1>

	<form:form action="saveUser" method="post" modelAttribute="user">
		<form:hidden path="id" />
		<table>
			<tr>
				<td>Email Address</td>
				<td><form:input path="emailAddress" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><form:input path="password" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Add User"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>