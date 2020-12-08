<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body align="center" bgcolor="BEEEE3">
	<h1>Welcome to Doctor Profile</h1>
	<br>
	<br>
	<a href="Doctor_Home.html">Home</a> |
	<a href="Doctor_Profile.jsp">Profile</a> |
	<a href="View_Appointment.jsp">Appointment Details</a> |
	<a href="index.html">Logout</a>
	<br>
	<br>


	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Specialisation</td>
			<td>Action</td>
		</tr>
	<%@page import = "com.motivity.doctor.DoctorProfileBean" %>
	<%
	int id = (Integer) session.getAttribute("sid");
	DoctorProfileBean dpb = new DoctorProfileBean(); 
	dpb.setId(id);
	dpb.doctorProfile();
	%>
		<tr>
		<td><%=dpb.getId() %></td>
		<td><%=dpb.getName() %></td>
		<td><%=dpb.getEmail() %></td>
		<td><%=dpb.getPhone() %></td>
		<td><%=dpb.getSpecialisation() %></td>
		<td><a href="Doctor_Profile_Update_Display.jsp?msg=+id">Update</a></td>
		</tr>
		 
	</table>
</body>
</html>