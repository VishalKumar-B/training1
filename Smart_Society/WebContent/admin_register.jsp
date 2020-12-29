<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Register</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<center>
		<h2>Welcome To Admin Registration</h2>
	</center>
	<br>
	<form action="./AdminRegisterController" method="post" align="center">
		<br>
		<table align="center">
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="admin_name"
					placeholder="Enter name "></td>
			</tr>
			<tr>
				<td align="right">email id:</td>
				<td align="left"><input type="email" name="admin_email"
					placeholder="Enter email "></td>
			</tr>
			<tr>
				<td align="right">Password:</td>
				<td align="left"><input type="password" name="admin_password"
					placeholder="Enter password "></td>
			</tr>
				<tr>
				<td align="right"><input type="button" value="&#8592; back"
					onclick="location.href='admin_home.jsp'"></td>
				<td align="left"><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>