<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Security Guard Register</title>
<style>
textarea {
  resize: none;
}
</style>
</head>
<body bgcolor="C5EEF9">
	<br>
	<center>
		<h2>Welcome To Security Guard Registration Page</h2>
	</center>
	<br>
	<form action="./SecurityGuardRegisterController" method="post" align="center">
	<br>
		<table align="center">
		<tr>
		<td align="right">Name:</td>
		<td align="left"><input type="text" name="securityguard_name" placeholder="Enter Name"></td>
		</tr>
		<tr>
		<td align="right">E-mail:</td>
		<td align="left"><input type="email" name="securityguard_email" placeholder="Enter Email"></td>
		</tr>
		<tr>
		<td align="right">Password:</td>
		<td align="left"><input type="text" name="securityguard_password" placeholder="Enter Password"></td>
		</tr>
		<tr>
		<td align="right">Mobile Number:</td>
		<td align="left"><input type="number" name="securityguard_phone" placeholder="Enter Mobile Number"></td>
		</tr>
		<tr>
		<td align="right">Education Details:</td>
		<td align="left"><select name="securityguard_education">
						<option value="none" selected disabled hidden>-select-</option>
						<option value="10th">10th</option>
						<option value="Inter">10+2</option>
						<option value="Graduate">Graduate</option>
				</select></td>
		</tr>
		<tr>
		<td align="right">Aadhar Number:</td>
		<td align="left"><input type="number" name="securityguard_aadhar" placeholder="Enter Aadhar number"></td>
		</tr>
		<tr>
		<td align="right">Experience:</td>
		<td align="left"><input type="number" name="securityguard_experience" placeholder="Enter Experience in years"></td>
		</tr>
		<tr>
		<td align="right">Address:</td>
		<td align="left"><textarea rows="3" cols="22" name="securityguard_address"></textarea></td>
		</tr>
		<tr>
				<td align="right"><input type="button" value="&#8592; back"
					onclick="location.href='admin_home.jsp'"></td>
				<td align="left"><input type="submit" value="Register"></td>
		</tr>
</body>
</html>