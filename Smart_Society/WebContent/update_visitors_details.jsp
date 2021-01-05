<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Update Visitor's Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<center>
		<h1>Welcome To Visitor's Details Update</h1>
	</center>
	<br>
	<form action="./UpdateVisitorDetailsController" method="post"
		align="center">
		<div class="myDiv">
			<br>
			<table align="center">
				<tr>
					<td align="right">Name:</td>
					<td align="left"><input type="text" name="visitor_name"
						id="l1" placeholder="Enter Visitor Name"></td>
				</tr>
				<tr>
					<td align="right">Mobile Number:</td>
					<td align="left"><input type="number" name="visitor_mobile"
						id="l1" placeholder="Enter Visitor's Mobile Number"></td>
				</tr>
				<tr>
					<td align="right">Aadhar Number:</td>
					<td align="left"><input type="number" name="visitor_aadhar_id"
						id="l1" placeholder="Enter Visitor's Aadhar Number"></td>
				</tr>
				<tr>
					<td align="right">Visiting To:</td>
					<td align="left"><input type="number"
						name="visitor_visit_flat" id="l1" placeholder="Enter Flat Number"></td>
				</tr>
				<tr>
					<td align="right">Owner Name:</td>
					<td align="left"><input type="text" name="visitor_visit_name"
						id="l1" placeholder="Enter Name"></td>
				</tr>
				<tr>
					<td align="right">Visit Time:</td>
					<td align="left"><input type="time" name="visitor_visit_time"
						id="l1"></td>
				</tr>
				<tr>
					<td align="right"><input type="button" value="&#8592; back"
						id="b1" onclick="location.href='securityguard_home.jsp'"></td>
					<td align="left"><input type="submit" value="Update" id="b1"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>