<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Security Guard Profile</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Security Guard Profile</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2" id="t1">
		<tr>
			<td style='border: none' colspan="8"><input type="button"
				value="&#8592; back" id="b1"
				onclick="location.href='securityguard_home.jsp'">
		</tr>
		<tr>
			<th>Id:</th>
			<th>Name:</th>
			<th>Phone:</th>
			<th>Email:</th>
			<th>Address</th>
			<th>Education:</th>
			<th>Aadhar:</th>
			<th>Experience:</th>
		<tr>
			<%@page
				import="com.motivity.securityguard.SecurityGuardProfileBean,
			com.motivity.securityguard.SecurityGuardPOJO
			,java.util.ArrayList,java.util.List"%>
			<%
				SecurityGuardProfileBean sgpb = new SecurityGuardProfileBean();
			int sid = (Integer) session.getAttribute("securityguard_id");
			List<SecurityGuardPOJO> list = sgpb.getdetails(sid);
			for (SecurityGuardPOJO sgp : list) {
			%>
		
		<tr>
			<td><%=sgp.getSecurityguard_id()%></td>
			<td><%=sgp.getSecurityguard_name()%></td>
			<td><%=sgp.getSecurityguard_phone()%></td>
			<td><%=sgp.getSecurityguard_email()%></td>
			<td><%=sgp.getSecurityguard_address()%></td>
			<td><%=sgp.getSecurityguard_education()%></td>
			<td><%=sgp.getSecurityguard_aadhar()%></td>
			<td><%=sgp.getSecurityguard_experience()%>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>