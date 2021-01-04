<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Security Login</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Security Guard Login</h1>
	</center>
	<br>
	<br>
	<form action="./SecurityGuardLoginController" method="post" align="center">
		<table align="center">

			<tr>
				<td align="right">Email:</td>
				<td align="left"><input type="email" name="securityguard_email" id="l1"
					placeholder="Enter email"></td>
			</tr>
			<tr>
				<td align="right">Password:</td>
				<td align="left"><input type="password" name="securityguard_password" id="l1"
					placeholder="Enter password"></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back" id="b1"
					onclick="location.href='index.html'"></td>
				<td align="left"><input type="submit" value="Login" id="b1"></td>
			</tr>

		</table>
	</form>
</body>
</html>