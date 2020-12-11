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
	<table border="1" align="center">
		<tr>
			<td>Patient Name</td>
			<td>Phone Number</td>
			<td>Email</td>
			<td>Gender</td>
			<td>Blood Group</td>
			<td>Specialist</td>
			<td>Date</td>
			<td>Time</td>
			<td>Status</td>
			<td>Doctor Name</td>
		</tr>

		<%@page
			import="com.motivity.patient.PatientAppointmentStatusBean,java.util.ArrayList,java.util.Iterator"%>
		<%
			int pid = (Integer) session.getAttribute("sid");

		PatientAppointmentStatusBean pasb2 = new PatientAppointmentStatusBean();

		pasb2.setPid(pid);

		ArrayList<PatientAppointmentStatusBean> al = pasb2.patientAppointmentStatus();
		Iterator i = al.iterator();

		while (i.hasNext()) {
			pasb2 = (PatientAppointmentStatusBean) i.next();
		%>
		<tr>
			<td><%=pasb2.getName()%></td>
			<td><%=pasb2.getPhone()%></td>
			<td><%=pasb2.getEmail()%></td>
			<td><%=pasb2.getGender()%></td>
			<td><%=pasb2.getBlood_group()%></td>
			<td><%=pasb2.getSpecialist()%></td>
			<td><%=pasb2.getDate_of_appointment()%></td>
			<td><%=pasb2.getTime_of_appointment()%></td>
			<td><%=pasb2.getStatus()%></td>
			<td><%=pasb2.getDoctor_name()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>