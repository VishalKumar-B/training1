<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Update Courier Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<center>
		<h2>Welcome To Courier Details Update</h2>
	</center>
	<br>
	<form action="./UpdateCourierDetailsController" method="post" align="center">
		<br>
		<table align="center">
			<tr>
				<td align="right">Flat Number:</td>
				<td align="left"><input type="number" id="l1"
					name="courier_flat_number" placeholder="Enter Flat Number"></td>
			</tr>
			<tr>
				<td align="right">To:</td>
				<td align="left"><input type="text" id="l1"
					name="courier_receiver_name" placeholder="Enter Name"></td>
			</tr>
			<tr>
				<td align="right">Received From:</td>
				<td align="left"><input type="text" name="courier_from_address" id="l1"
					placeholder="Enter Received From Name"></td>
			</tr>
			<tr>
				<td align="right">Date:</td>
				<td align="left"><input type="date" id="l1"
					name="courier_received_date"></td>
			</tr>
			<tr>
				<td align="right">Time:</td>
				<td align="left"><input type="time" id="l1"
					name="courier_received_time"></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back" id="b1"
					onclick="location.href='securityguard_home.jsp'"></td>
				<td align="left"><input type="submit" id="b1" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>