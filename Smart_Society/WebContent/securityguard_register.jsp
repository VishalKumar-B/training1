<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
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
		<h1>Welcome To Security Guard Registration Page</h1>
	</center>
	<br>
	<form action="./SecurityGuardRegisterController" method="post"
		align="center">
		<div class="myDiv">
			<br>
			<table align="center">
				<tr>
					<td align="right">Name:</td>
					<td align="left"><input type="text" name="securityguard_name"
						id="l1" placeholder="Enter Name"></td>
				</tr>
				<tr>
					<td align="right">E-mail:</td>
					<td align="left"><input type="email"
						name="securityguard_email" id="l1" placeholder="Enter Email"></td>
				</tr>
				<tr>
					<td align="right">Password:</td>
					<td align="left"><input type="password"
						name="securityguard_password" id="l1" placeholder="Enter Password"></td>
				</tr>
				<tr>
					<td align="right">Mobile Number:</td>
					<td align="left"><input type="number"
						name="securityguard_phone" id="l1"
						placeholder="Enter Mobile Number"></td>
				</tr>
				<tr>
					<td align="right">Education Details:</td>
					<td align="left"><select name="securityguard_education"
						id="l1">
							<option value="none" selected disabled hidden>-select-</option>
							<option value="10th">10th</option>
							<option value="Inter">10+2</option>
							<option value="Graduate">Graduate</option>
					</select></td>
				</tr>
				<tr>
					<td align="right">Aadhar Number:</td>
					<td align="left"><input type="number"
						name="securityguard_aadhar" id="l1"
						placeholder="Enter Aadhar number"></td>
				</tr>
				<tr>
					<td align="right">Experience:</td>
					<td align="left"><input type="number"
						name="securityguard_experience" id="l1"
						placeholder="Enter Experience in years"></td>
				</tr>
				<tr>
					<td align="right">Address:</td>
					<td align="left"><textarea rows="3" cols="22" id="l1"
							name="securityguard_address"></textarea></td>
				</tr>
				<tr>
					<td align="right"><input type="button" id="b1"
						value="&#8592; back" onclick="location.href='admin_home.jsp'"></td>
					<td align="left"><input type="submit" id="b1" value="Register"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>