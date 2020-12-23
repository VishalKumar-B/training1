<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
				<td align="left"><input type="text" name="name"
					placeholder="Enter name "></td>
			</tr>
			<tr>
				<td align="right">email id:</td>
				<td align="left"><input type="email" name="email"
					placeholder="Enter email "></td>
			</tr>
			<tr>
				<td align="right">FlatType:</td>
				<td align="left"><select name="type">
						<option value="none" selected disabled hidden>-select-</option>
						<option value="1RK">1RK</option>
						<option value="1BHK">1BHK</option>
						<option value="2BHK">2BHK</option>
						<option value="3BHK">3BHK</option>
						<option value="OFFICE">OFFICE</option>
				</select></td>
			</tr>
			<tr>
				<td align="right">Flat Number:</td>
				<td align="left"><input type="text" name="flatnumber"
					placeholder="Enter flat number "></td>
			</tr>
			<tr>
				<td align="right">Aadhar Number:</td>
				<td align="left"><input type="number" name="adhar"
					placeholder="Enter adhar card number "></td>
			</tr>
			<tr>
				<td align="right">Mobile Number:</td>
				<td align="left"><input type="number" name="mobilenumber"
					placeholder="Enter mobile number "></td>
			</tr>
			<tr>
				<td align="right">Gender:</td>
				<td align="left"><input type="radio" name="gender" value="Male">Male
					<input type="radio" name="gender" value="Female">Female</td>
			</tr>
			<tr>
				<td align="right">Password:</td>
				<td align="left"><input type="text" name="password"
					placeholder="Enter password "></td>
			</tr>
			<tr>
				<td align="right">Date Of Joining:</td>
				<td align="left"><input type="date" name="date_of_joining"
					placeholder="Enter date of your joining"></td>
			</tr>
			<tr>
				<td align="right">Floor Number:</td>
				<td align="left"><select name="FLOORNUMBER">
						<option value="none" selected disabled hidden>-select-</option>
						<option value="1">ONE</option>
						<option value="2">TWO</option>
						<option value="2">THREE</option>
						<option value="4">FOUR</option>
				</select></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back"
					onclick="location.href='index.html'"></td>
				<td align="left"><input type="submit" value="Register"></td>
			</tr>
			<tr>
			<td></td>
			<td align="left"><br><br>Already registered?<a href="owner_login.jsp"> Login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>