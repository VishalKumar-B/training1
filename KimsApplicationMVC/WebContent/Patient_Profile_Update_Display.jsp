<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body align="center" bgcolor="BEEEE3">
	<h1>Welcome to Patient Home</h1>
	<br>
	<br>
	<a href="Patient_Home.html">Home</a> |
	<a href="Patient_Profile.jsp">Profile</a> |
	<a href="Appointment.jsp">Appointment</a> |
	<a href="Patient_Appointment_Status.jsp">Appointment Status</a> |
	<a href="index.html">Logout</a>
	<br>
	<br>
	<%@ page import="com.motivity.patient.PatientProfileUpdateDisplayBean"%>
	
	<%
	PatientProfileUpdateDisplayBean ppud = new PatientProfileUpdateDisplayBean();
	int id = (Integer) session.getAttribute("sid");
	ppud.setId(id);
	ppud.patientProfileUpdateDisplay();
	%>
	<form action="./Patient_Profile_Update.jsp" method="post">
		<table align="center">
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="name"
					value="<%=ppud.getName()%>"></td>
			</tr>
			<tr>
				<td align="right">E-mail:</td>
				<td align="left"><input type="email" name="email"
					value="<%=ppud.getEmail()%>"></td>
			</tr>
			<tr>
				<td align="right">Age:</td>
				<td align="left"><input type="number" name="age"
					value="<%=ppud.getAge()%>"></td>
			</tr>
			<tr>
				<td align="right">Phone Number:</td>
				<td align="left"><input type="number" name="phone"
					value="<%=ppud.getPhone()%>"></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="Update"></td>
				<td align="left"><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
