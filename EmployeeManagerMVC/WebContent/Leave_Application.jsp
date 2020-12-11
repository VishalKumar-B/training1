<!DOCTYPE html>
<html>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Apply Leave Page</h1>
		<a href="Employee_Home.html">Home</a> | <a href="Employee_Profile.jsp">Profile</a>
		| <a href="Leave_Application.jsp">Leave Application</a> | <a
			href="Leave_Status.jsp">Leave status</a> | <a href="index.html">logout</a>
	</center>
	<br>
	<br>
	<%@page import = "com.motivity.employee.LeaveApplicationBean,
					com.motivity.employee.LeaveApplicationManagerNameBean, 
					java.util.ArrayList,java.util.Iterator"%>
	<%
		int eid = (Integer) session.getAttribute("eid");

		LeaveApplicationBean lab = new LeaveApplicationBean();
		lab.setEid(eid);
		lab.leaveApplication();
	%>
	<form action="./Apply_Leave.jsp?lr=<%=lab.getLeaves_remaining()%>"
		align="center">
		<table align="center">
			<tr>
				<td></td>
				<td><label>Leaves Remaining:<%=lab.getLeaves_remaining()%></label>
					<br> <br></td>
			</tr>
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="name"
					value="<%=lab.getName()%>" readonly></td>
			</tr>
			<tr>
				<td align="right">Email:</td>
				<td align="left"><input type="email" name="email"
					value="<%=lab.getEmail()%>" readonly></td>
			</tr>
			<tr>
				<td align="right">Phone:</td>
				<td align="left"><input type="number" name="phone"
					value="<%=lab.getPhone()%>" readonly></td>
			</tr>
			<tr>
				<td align="right">Number Of Days:</td>
				<td align="left"><input type="number" name="no_of_days"
					placeholder="Enter no of days"></td>
			</tr>
			<tr>
				<td align="right">From:</td>
				<td align="left"><input type="date" name="from_date"
					placeholder="select form date"></td>
			</tr>
			<tr>
				<td align="right">To:</td>
				<td align="left"><input type="date" name="to_date"
					placeholder="select to date"></td>
			</tr>
			<tr>
				
				<td align="right">Manager Name:</td>
				<td align="left"><select name="manager_name">
						<option value="none" selected disabled hidden>-select-</option>
				<%
				LeaveApplicationManagerNameBean lamb = new LeaveApplicationManagerNameBean();
				ArrayList<LeaveApplicationManagerNameBean> al = lamb.managerNameDisplay();
				Iterator i = al.iterator();

				while (i.hasNext()) {
					lamb = (LeaveApplicationManagerNameBean) i.next();
				%>
						<option value="<%=lamb.getManager_name()%>"><%=lamb.getManager_name()%></option>
				<%} %>
				</select>

			</tr>
			<tr>
				<td></td>
				<td align="justify"><input type="submit" value="Apply"></td>
			</tr>
		</table>
	</form>
</body>
</html>