<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Profile</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Admin Profile</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back"
				onclick="location.href='securityguard_home.jsp'">
		</tr>
		<tr>
			<td>Id:</td>
			<td>Name:</td>
			<td>Email:</td>
		</tr>

		<%@page
			import="com.motivity.admin.AdminLogin,com.motivity.admin.AdminPOJO"%>
		<%
			AdminLogin alb = new AdminLogin();
		%>
		<tr>
			<td><%=%></td>
			<td><%=%></td>
			<td><%=%>
		</tr>
</body>
</html>