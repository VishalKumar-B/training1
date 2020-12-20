<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Administrator Login</h1>
	</center>
	<br>
	<br>
	<form action="./AdminLogin" method="post" align="center">
		<table align="center">
			
			<tr>
				<td align="right">Email: </td>
				<td align="left"><input type="email" name="admin_email" placeholder="Enter email"></td>
			</tr>
			<tr>
				<td align="right">Password: </td>
				<td align="left"><input type="password" name="admin_password"
					placeholder="Enter password"></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back" onclick="location.href='index.html'"></td>
				<td align="left"><input type="submit" value="Login"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>