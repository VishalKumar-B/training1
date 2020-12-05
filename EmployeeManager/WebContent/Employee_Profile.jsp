<!DOCTYPE html>
<html>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Employee Home Page</h1>
		<a href="Employee_Home.html">Home</a> | 
		<a href="Employee_Profile.jsp">Profile</a> | 
		<a href="Leave_Application.jsp">Leave Application</a> | 
		<a href="Leave_Status.jsp">Leave status</a> | 
		<a href="index.html">logout</a>
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
		<%@include file="connection.jsp"%>
	<%
		int eid = (int) session.getAttribute("eid");
	ps = connection.prepareStatement("select * from employee where eid=?");
	ps.setInt(1, eid);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<tr>
		<td><%=rs.getInt("eid")%></td>
		<td><%=rs.getString("name")%></td>
		<td><%=rs.getString("email")%></td>
		<td><%=rs.getInt("phone")%></td>
		<td><%=rs.getString("date_of_birth")%></td>
		<td><%=rs.getInt("age")%></td>
		<td><%=rs.getString("gender")%></td>
		<td><%=rs.getString("designation") %></td>
		<td><%=rs.getInt("experience") %></td>
		<td><a href="Employee_Profile_Update_Display.jsp">update</a></td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>