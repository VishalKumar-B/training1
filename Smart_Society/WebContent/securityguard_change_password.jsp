<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Security Guard Change Password</h1>
	</center>
	<br>
	<br>
	<form action="./SecurityGuardChangePasswordController" method="post" align="center">
		<table align="center">

			<tr>
				<td align="right">Old Password:</td>
				<td align="left"><input type="password" name="old_securityguard_password"
					placeholder="Enter old password"></td>
			</tr>
			<tr>
				<td align="right">New Password:</td>
				<td align="left"><input type="password" name="new_securityguard_password"
					placeholder="Enter new password"></td>
			</tr>
			<tr>
				<td align="right">Confirm New Password:</td>
				<td align="left"><input type="password" name="new_securityguard_password_confirm"
					placeholder="confirm new password"></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back"
					onclick="location.href='securityguard_home.jsp'"></td>
				<td align="left"><input type="submit" value="change password"></td>
			</tr>

		</table>
</body>
</html>