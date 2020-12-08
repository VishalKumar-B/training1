<!DOCTYPE html>
<html>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Employee Leave Status</h1>
		<a href="Employee_Home.html">Home</a> | 
		<a href="Employee_Profile.jsp">Profile</a> | 
		<a href="Leave_Application.jsp">Leave Application</a> | 
		<a href="Leave_Status.jsp">Leave status</a> | 
		<a href="index.html">logout</a>
	</center>
	<br><br>
	<%@include file="connection.jsp"%>
	<table border="1" align="center">
		<tr>
			<td>Employee Name:</td>
			<td>Email:</td>
			<td>Phone:</td>
			<td>No of days</td>
			<td>From:</td>
			<td>To:</td>
			<td>Status:</td>
		</tr>
		<%
		int eid=(Integer)session.getAttribute("eid");
		ps = connection.prepareStatement("select * from leaves where eid=?");
		ps.setInt(1,eid);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("name") %></td>
			<td><%=rs.getString("email") %></td>
			<td><%=rs.getInt("phone") %></td>
			<td><%=rs.getInt("no_of_days") %></td>
			<td><%=rs.getString("from_date") %></td>
			<td><%=rs.getString("to_date") %></td>
			<td><%=rs.getString("status") %></td>
		</tr>

		<%
			}
		%>
	</table>
	<br>
	<br>
</body>
</html>