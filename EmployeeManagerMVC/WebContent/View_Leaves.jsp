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
		<%@page
			import="com.motivity.manager.ViewLeavesBean,java.util.ArrayList,java.util.Iterator"%>
		<%
			String manager_name = (String) session.getAttribute("mname");

		ViewLeavesBean vlb2 = new ViewLeavesBean();
		vlb2.setManager_name(manager_name);

		ArrayList<ViewLeavesBean> al = vlb2.viewLeaves();
		Iterator i = al.iterator();

		while (i.hasNext()) {
			vlb2 = (ViewLeavesBean) i.next();
		%>
		<tr>
			<td><%=vlb2.getName()%></td>
			<td><%=vlb2.getEmail()%></td>
			<td><%=vlb2.getPhone()%></td>
			<td><%=vlb2.getNo_of_days()%></td>
			<td><%=vlb2.getFrom_date()%></td>
			<td><%=vlb2.getTo_date()%></td>
			<td><%=vlb2.getStatus()%></td>
			<%
				if (vlb2.getStatus().equalsIgnoreCase("Accepted")) {
			%>
			<td>Accepted</td>
			<%
				} else if (vlb2.getStatus().equalsIgnoreCase("Rejected")) {
			%>
			<td>Rejected</td>
			<%
				} else {
			%>
			<td><a href="Accept_Leave.jsp"> <%
 	session.setAttribute("eid", vlb2.getEid());
 session.setAttribute("no_of_days", vlb2.getNo_of_days());
 %>Accept
			</a> <a href="Reject_Leave.jsp?lid=<%=vlb2.getLid()%>">Rejected </a></td>
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