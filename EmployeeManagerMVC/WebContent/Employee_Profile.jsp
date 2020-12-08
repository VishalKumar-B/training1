<!DOCTYPE html>
<html>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Employee Home Page</h1>
		<a href="Employee_Home.html">Home</a> | <a href="Employee_Profile.jsp">Profile</a>
		| <a href="Leave_Application.jsp">Leave Application</a> | <a
			href="Leave_Status.jsp">Leave status</a> | <a href="index.html">logout</a>
	</center>
	<br>
	<br>
	<table border="1px;" align="center">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Date Of Birth</td>
			<td>Age</td>
			<td>Gender</td>
			<td>Designation</td>
			<td>Experience</td>
			<td>Action</td>
		</tr>
		<%@page import="com.motivity.employee.EmployeeProfileBean"%>
		<%
			int eid = (int) session.getAttribute("eid");

		EmployeeProfileBean epb = new EmployeeProfileBean();
		epb.setEid(eid);
		epb.employeeProfile();
		%>
		<tr>
			<td><%=epb.getEid()%></td>
			<td><%=epb.getName()%></td>
			<td><%=epb.getEmail()%></td>
			<td><%=epb.getPhone()%></td>
			<td><%=epb.getDate_of_birth()%></td>
			<td><%=epb.getAge()%></td>
			<td><%=epb.getGender()%></td>
			<td><%=epb.getDesignation()%></td>
			<td><%=epb.getExperience()%></td>
			<td><a href="Employee_Profile_Update_Display.jsp">update</a></td>
		</tr>

	</table>
</body>
</html>