<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body align="center" bgcolor="BEEEE3">
	<h1>Welcome to Patient Profile</h1>
	<br>
	<br>
	<a href="Patient_Home.html">Home</a> |
	<a href="Patient_Profile.jsp">Profile</a> |
	<a href="Appointment.jsp">Appointment</a> |
	<a href="Patient_Appointment_Status.jsp">Appointment Status</a> |
	<a href="index.html">Logout</a>
	<br>
	<br>
	<%@ page import="java.sql.*"%>
	<%@include file="connection.jsp"%>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Age</td>
			<td>Phone</td>
			<td>Action</td>
		</tr>
		<%@page import="com.motivity.patient.PatientProfileBean"%>
		<%
			int id = (Integer) session.getAttribute("sid");
		PatientProfileBean ppb = new PatientProfileBean();
		ppb.setId(id);
		ppb.patientProfile();
		%>

		<tr>
			<td><%=ppb.getId()%></td>
			<td><%=ppb.getName()%></td>
			<td><%=ppb.getEmail()%></td>
			<td><%=ppb.getAge()%></td>
			<td><%=ppb.getPhone()%></td>
			<td><a href="Patient_Profile_Update_Display.jsp?msg=+id">Update</a></td>
		</tr>

	</table>
</body>
</html>