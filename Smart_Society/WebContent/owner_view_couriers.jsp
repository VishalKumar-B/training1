<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Couriers</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome To View Received Couriers</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2" id="t1">
		<tr>
			<td style='border: none' colspan="6"><input type="button" id="b1"
				value="&#8592; back" onclick="location.href='owner_home.jsp'">
		</tr>
		<tr>
			<th>Id:</th>
			<th>To:</th>
			<th>FlatNumber:</th>
			<th>From:</th>
			<th>Received Date:</th>
			<th>Received Time:</th>
		</tr>


		<%@page
			import="com.motivity.owner.OwnerViewCouriersBean,
			com.motivity.securityguard.CourierPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
			OwnerViewCouriersBean ocb = new OwnerViewCouriersBean();
		int flatnumber = (Integer) session.getAttribute("owner_flatnumber");
		List<CourierPOJO> list = ocb.getdetails(flatnumber);
		for (CourierPOJO cp : list) {
		%>
		<tr>
			<td><%=cp.getCourier_id()%></td>
			<td><%=cp.getCourier_receiver_name()%></td>
			<td><%=cp.getCourier_flat_number()%></td>
			<td><%=cp.getCourier_from_address()%>
			<td><%=cp.getCourier_received_date()%></td>
			<td><%=cp.getCourier_received_time()%></td>
		</tr>


		<%
			}
		if (list.isEmpty()) {
		%>
		<tr>
			<td colspan="10" align="center"><label style="color: red">No
					couriers exist</label></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>