<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body align="center" bgcolor="BEEEE3">
	<h1>Appointments</h1>
	<br>
	<br>
	<a href="Doctor_Home.html">Home</a> |
	<a href="Doctor_Profile.jsp">Profile</a> |
	<a href="View_Appointment.jsp">Appointment Details</a> |
	<a href="index.html">Logout</a>
	<br>
	<br>

	<%@include file="connection.jsp"%>
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
			<td>Action</td>
		</tr>

		<%@page
			import="com.motivity.doctor.ViewAppointmentBean,java.util.ArrayList,java.util.Iterator"%>
		<%
			String specialisation = (String) session.getAttribute("sspecialisation");

		ViewAppointmentBean vab2 = new ViewAppointmentBean();
		vab2.setSpecialist(specialisation);

		ArrayList<ViewAppointmentBean> al = vab2.viewAppointment();
		Iterator i = al.iterator();

		while (i.hasNext()) {
			vab2 = (ViewAppointmentBean) i.next();
		%>


		<tr>
			<td><%=vab2.getName()%></td>
			<td><%=vab2.getPhone()%></td>
			<td><%=vab2.getEmail()%></td>
			<td><%=vab2.getGender()%></td>
			<td><%=vab2.getBlood_group()%></td>
			<td><%=vab2.getSpecialist()%></td>
			<td><%=vab2.getDate_of_appointment()%></td>
			<td><%=vab2.getTime_of_appointment()%></td>
			<td><%=vab2.getStatus()%></td>
			<td><%=vab2.getDoctor_name()%></td>
			<%
				if (vab2.getStatus().equalsIgnoreCase("Accepted")) {
			%>
			<td>Accepted</td>
			<%
				} else {
			%>
			<td><a href="Accept_Appointment.jsp?id=<%=vab2.getAid()%>">Accept</a></td>
			<%
				}
			}
			%>
		</tr>
	</table>
</body>
</html>