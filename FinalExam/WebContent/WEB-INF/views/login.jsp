<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1 align="center">Login Page</h1>

	<form:form action="loginUser" method="post" modelAttribute="user">
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
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>