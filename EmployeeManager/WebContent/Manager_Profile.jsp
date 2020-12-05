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
		<%@include file="connection.jsp"%>
		<%
			int id = (int) session.getAttribute("mid");
		ps = connection.prepareStatement("select * from manager where mid=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("mid")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getInt("phone")%></td>
			<td><%=rs.getString("date_of_birth")%></td>
			<td><%=rs.getInt("age")%></td>
			<td><%=rs.getString("gender")%></td>
			<td><%=rs.getInt("experience")%></td>
			<td><a href="Manager_Profile_Update_Display.jsp">update</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>