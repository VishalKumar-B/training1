<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Owner Details:</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back"
				onclick="location.href='admin_home.jsp'">
		</tr>
		<tr>
			<td>Id:</td>
			<td>Name:</td>
			<td>Email:</td>
			<td>Flat Number:</td>
			<td>DOJ:</td>
			<td>Aadhar:</td>
			<td>Flat Type:</td>
			<td>Floor Number:</td>
			<td>Gender:</td>
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
			<td><%=op.getId()%></td>
			<td><%=op.getName()%></td>
			<td><%=op.getEmailid()%></td>
			<td><%=op.getFlatnumber()%></td>
			<td><%=op.getDateofjoing()%></td>
			<td><%=op.getAdharnumber()%></td>
			<td><%=op.getFlattype()%></td>
			<td><%=op.getFloornumber()%>
			<td><%=op.getGender() %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>