<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Payment Details:</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back"
				onclick="location.href='securityguard_home.jsp'">
		</tr>
		<tr>
			<td>Payment Id:</td>
			<td>Name:</td>
			<td>Phone:</td>
			<td>Email:</td>
			<td>Address</td>
			<td>Education:</td>
			<td>Aadhar:</td>
			<td>Experience:</td>
		<tr>
			<%@page
				import="com.motivity.owner.OwnerPOJO,
			com.motivity.admin.OwnerDetailsBean
			,java.util.ArrayList,java.util.List"%>
			<%
				OwnerDetailsBean odb = new OwnerDetailsBean();
			List<OwnerPOJO> list = odb.getdetails();
			for (OwnerPOJO op : list) {
			%>
		
		<tr>
			<td><%=%></td>
			<td><%=%></td>
			<td><%=%></td>
			<td><%=%></td>
			<td><%=%></td>
			<td><%=%></td>
			<td><%=%></td>
			<td><%=%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>