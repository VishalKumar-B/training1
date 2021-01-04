<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Owner Register</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<center>
		<h2>Welcome To Owner Registration</h2>
	</center>
	<br>
	<form action="./OwnerRegisterController" method="post" align="center">
		<br>
		<table align="center">
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="name" id="l1"
					placeholder="Enter name "></td>
			</tr>
			<tr>
				<td align="right">email id:</td>
				<td align="left"><input type="email" name="email" id="l1"
					placeholder="Enter email "></td>
			</tr>
			<tr>
				<td align="right">FlatType:</td>
				<td align="left"><select name="type" id="l1">
						<option value="none" selected disabled hidden>-select-</option>
						<option value="1BHK">1BHK</option>
						<option value="2BHK">2BHK</option>
						<option value="3BHK">3BHK</option>
				</select></td>
			</tr>
			<tr>
				<td align="right">Flat Number:</td>
				<td align="left"><input type="text" name="flatnumber" id="l1"
					placeholder="Enter flat number "></td>
			</tr>
			<tr>
				<td align="right">Aadhar Number:</td>
				<td align="left"><input type="number" name="adhar" id="l1"
					placeholder="Enter adhar card number "></td>
			</tr>
			<tr>
				<td align="right">Mobile Number:</td>
				<td align="left"><input type="number" name="mobilenumber" id="l1"
					placeholder="Enter mobile number "></td>
			</tr>
			<tr>
				<td align="right">Gender:</td>
				<td align="left"><input type="radio" name="gender" value="Male" id="l1">Male
					<input type="radio" name="gender" value="Female" id="l1">Female</td>
			</tr>
			<tr>
				<td align="right">Password:</td>
				<td align="left"><input type="password" name="password" id="l1"
					placeholder="Enter password "></td>
			</tr>
			<tr>
				<td align="right">Date Of Joining:</td>
				<td align="left"><input type="date" name="date_of_joining" id="l1"
					placeholder="Enter date of your joining"></td>
			</tr>
			<tr>
				<td align="right">Floor Number:</td>
				<td align="left"><select name="FLOORNUMBER" id="l1">
						<option value="none" selected disabled hidden>-select-</option>
						<option value="1">ONE</option>
						<option value="2">TWO</option>
						<option value="2">THREE</option>
						<option value="4">FOUR</option>
				</select></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back" id="b1"
					onclick="location.href='index.html'"></td>
				<td align="left"><input type="submit" value="Register" id="b1"></td>
			</tr>
			<tr>
			<td></td>
			<td align="left"><br><br>Already registered? &nbsp<input type="button" value="Login" id="b1"
					onclick="location.href='owner_login.jsp'"></td>
			</tr>
		</table>
	</form>
</body>
</html>