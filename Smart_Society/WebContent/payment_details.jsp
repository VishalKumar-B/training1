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
		<h1>Welcome to Payment:</h1>
	</center>
	<br>
	<br>
	<table align="center" cellpadding="2">
	<%@page
				import="com.motivity.owner.OwnerProfileBean,
			com.motivity.owner.OwnerPOJO
			,java.util.ArrayList,java.util.List"%>
			<%
			OwnerProfileBean opb = new OwnerProfileBean();
			int id = (Integer)session.getAttribute("owner_id");
			List<OwnerPOJO> list = opb.getdetails(id);
			for (OwnerPOJO sgp : list) {
			%>
		<tr>
			<td align="right">Id:</td>
			<td align="left"><input type="number" value="<%=sgp.getId()%>" readonly></td>
		</tr>
		<tr>
			<td align="right">Name:</td>
			<td align="left"><input type="text" value="<%=sgp.getName()%>" readonly></td>
		</tr>
		<tr>
			<td align="right">Email:</td>
			<td align="left"><input type="email" value="<%=sgp.getEmailid()%>" readonly></td>
		</tr>
		<tr>
			<td align="right">Flat Number:</td>
			<td align="left"><input type="number" value="<%=sgp.getFlatnumber()%>" readonly></td>
		</tr>
		<tr>
			<td align="right">Current Invoice:</td>
			<td align="left"><input type="number"></td>
		</tr>
		<tr>
			<td align="right">Enter Amount:</td>
			<td align="left"><input type="number"></td>
		</tr>
		<tr>
			<td align="right" style='border: none'><input type="button"
				value="&#8592; back" onclick="location.href='owner_home.jsp'"></td>
			<td align="left"><input type="submit" value="proceed to pay"></td>
		</tr>
		<% } %>
	</table>
</body>
</html>