<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>view Maintenance</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Set Maintenance Amount</h1>
	</center>
	<br>
	<br>
	<form action="./SetRentController" method="post">
		<div class="myDiv">
			<table align="center">
				<tr>
					<td align="right">Select Flat:</td>
					<td align="left"><select name="flat_type" id="l1">
							<option value="none" selected disabled hidden>-select-</option>
							<option value="1BHK">1BHK</option>
							<option value="2BHK">2BHK</option>
							<option value="3BHK">3BHK</option>
					</select></td>
				</tr>

				<tr>
					<td align="right">Maintenance Amount:</td>
					<td align="left"><input type="number" name="rent"
						-webkit-appearance="none" id="l1" margin="0"></td>
				</tr>
				<tr>
					<td align="right"><input type="button" value="&#8592; back"
						id="b1" onclick="location.href='admin_home.jsp'"></td>
					<td align="left"><input type="submit" value="Set" id="b1"></td>
				</tr>
			</table>
		</div>
	</form>