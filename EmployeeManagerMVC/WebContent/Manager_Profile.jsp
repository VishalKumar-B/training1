<!DOCTYPE html>
<html>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Manager Profile</h1>
		<a href="Manager_Home.html">Home</a> | <a href="Manager_Profile.jsp">Profile</a>
		| <a href="View_Leaves.jsp">Leave Details</a> | <a href="index.html">logout</a>
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
			<td>Experience</td>
			<td>Action</td>
		</tr>
		<%@page import="com.motivity.manager.ManagerProfileBean"%>
		<%
			int mid = (int) session.getAttribute("mid");
		ManagerProfileBean mpb = new ManagerProfileBean();
		mpb.setMid(mid);
		mpb.managerProfile();
		%>
		<tr>
			<td><%=mpb.getMid()%></td>
			<td><%=mpb.getName()%></td>
			<td><%=mpb.getEmail()%></td>
			<td><%=mpb.getPhone()%></td>
			<td><%=mpb.getDate_of_birth()%></td>
			<td><%=mpb.getAge()%></td>
			<td><%=mpb.getGender()%></td>
			<td><%=mpb.getExperience()%></td>
			<td><a href="Manager_Profile_Update_Display.jsp">update</a></td>
		</tr>
	</table>
</body>
</html>