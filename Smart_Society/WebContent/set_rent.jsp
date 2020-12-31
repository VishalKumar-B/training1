<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Rent</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Set Rent</h1>
	</center>
	<br>
	<br>
	<form action="./SetRentController" method="post">
		<table align="center">
			<tr>
				<td align="right">Select Flat:</td>
				<td align="left"><select name="flat_type">
						<option value="none" selected disabled hidden>-select-</option>
						<option value="1BHK">1BHK</option>
						<option value="2BHK">2BHK</option>
						<option value="3BHK">3BHK</option>
				</select></td>
			</tr>

			<tr>
				<td align="right">Rent Amount:</td>
				<td align="left"><input type="number" name="rent" -webkit-appearance="none"
					margin="0"></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back"
					onclick="location.href='admin_home.jsp'"></td>
				<td align="left"><input type="submit" value="Set"></td>
			</tr>


		</table>
	</form>