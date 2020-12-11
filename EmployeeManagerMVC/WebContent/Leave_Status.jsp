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
	<%@page import = "com.motivity.employee.LeaveStatusBean,java.util.ArrayList,java.util.Iterator"%>
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
		LeaveStatusBean lsb2 = new LeaveStatusBean();
		lsb2.setEid(eid);
		ArrayList<LeaveStatusBean> al = lsb2.leaveStatus(); 
		Iterator i = al.iterator();
		
		while (i.hasNext()) {
			lsb2 = (LeaveStatusBean) i.next();
		%>
		<tr>
			<td><%=lsb2.getName() %></td>
			<td><%=lsb2.getEmail() %></td>
			<td><%=lsb2.getPhone() %></td>
			<td><%=lsb2.getNo_of_days() %></td>
			<td><%=lsb2.getFrom_date() %></td>
			<td><%=lsb2.getTo_date() %></td>
			<td><%=lsb2.getStatus() %></td>
		</tr>

		<%
			}
		%>
	</table>
	<br>
	<br>
</body>
</html>