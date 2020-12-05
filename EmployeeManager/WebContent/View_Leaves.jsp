<!DOCTYPE html>
<html>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Manager Home</h1>
		<a href="Manager_Home.html">Home</a> | <a href="Manager_Profile.jsp">Profile</a>
		| <a href="View_Leaves.jsp">Leave Details</a> | <a href="index.html">logout</a>
	</center>
	<br>
	<br>
	<%@include file="connection.jsp"%>
	<table border="1px;" align="center">
		<tr>
			<td>Employee Name:</td>
			<td>Email:</td>
			<td>Phone:</td>
			<td>No of days:</td>
			<td>From</td>
			<td>To</td>
			<td>Status</td>
			<td>Action</td>
		</tr>
		<%
			String manager_name = (String) session.getAttribute("mname");
		ps = connection.prepareStatement("select * from leaves where manager_name=?");
		ps.setString(1, manager_name);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getInt("phone")%></td>
			<td><%=rs.getInt("no_of_days")%></td>
			<td><%=rs.getString("from_date")%></td>
			<td><%=rs.getString("to_date")%></td>
			<td><%=rs.getString("status")%></td>
			<%
				if (rs.getString("status").equalsIgnoreCase("Accepted")) {
			%>
			<td>Accepted</td>
			<%
				} else if (rs.getString("status").equalsIgnoreCase("Rejected")) {
			%>
			<td>Rejected</td>
			<%
				} else {
			%>
			<td><a href="Accept_Leave.jsp"> <%
 	session.setAttribute("eid", rs.getInt("eid"));
 session.setAttribute("no_of_days", rs.getInt("no_of_days"));
 %>Accept
			</a> <a href="Reject_Leave.jsp?lid=<%=rs.getInt("lid")%>">Rejected </a></td>
		</tr>
		<%
			}
		}
		%>
	</table>
	<br>
	<br>
</body>
</html>