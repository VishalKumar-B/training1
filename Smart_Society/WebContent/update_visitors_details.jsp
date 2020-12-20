<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Visitor's Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<center>
		<h2>Welcome To Visitor's Details Update</h2>
	</center>
	<br>
	<form action=" " method="post" align="center">
		<br>
		<table align="center">
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="visitor_name" placeholder="Enter Visitor Name"></td>
			</tr>
			<tr>
				<td align="right">Mobile Number:</td>
				<td align="left"><input type="number" name="visitor_mobile" placeholder="Enter Visitor's Mobile Number"></td>
			</tr>
			<tr>
				<td align="right">Aadhar Number:</td>
				<td align="left"><input type="number" name="visitor_aadhar_id" placeholder="Enter Visitor's Aadhar Number"></td>
			</tr>
			<tr>
				<td align="right">Visiting To:</td>
				<td align="left"><input type="number" name="visitor_visit_flat" placeholder="Enter Flat Number"></td>
			</tr>
			<tr>
				<td align="right">Owner Name:</td>
				<td align="left"><input type="text" name="visitor_visit_name" placeholder="Enter Name"></td>
			</tr>
			<tr>
				<td align="right">Visit Time:</td>
				<td align="left"><input type="time" name="visitor_visit_time"></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back"
					onclick="location.href='securityguard_home.jsp'"></td>
				<td align="left"><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</body>
</html>