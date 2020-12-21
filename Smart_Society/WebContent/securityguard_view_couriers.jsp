<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Couriers</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome To View Couriers</h1>
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
			<td>Id:</td>
			<td>To:</td>
			<td>FlatNumber:</td>
			<td>From:</td>
			<td>Received Date:</td>
			<td>Received Time:</td>
		</tr>


		<%@page
			import="com.motivity.securityguard.SecurityGuardViewCouriersBean,
			com.motivity.securityguard.CourierPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
			SecurityGuardViewCouriersBean odb = new SecurityGuardViewCouriersBean();
		List<CourierPOJO> list = odb.getdetails();
		for (CourierPOJO sp : list) {
		%>
		<tr>
			<td><%=sp.getCourier_id()%></td>
			<td><%=sp.getCourier_receiver_name()%></td>
			<td><%=sp.getCourier_flat_number()%></td>
			<td><%=sp.getCourier_from_address()%>
			<td><%=sp.getCourier_received_date()%></td>
			<td><%=sp.getCourier_received_time()%></td>
		</tr>


		<%
			}
		%>
	</table>
</body>
</html>