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
	<%@include file="connection.jsp"%>
	<%
		int eid = (int) session.getAttribute("eid");
	ps = connection.prepareStatement("select * from employee where eid=?");
	ps.setInt(1, eid);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<form action="./Apply_Leave.jsp?lr=<%=rs.getInt("leaves_remaining")%>"
		align="center">
		<table align="center">
			<tr>
				<td></td>
				<td><label>Leaves Remaining:<%=rs.getInt("leaves_remaining")%></label>
					<br> <br></td>
			</tr>
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="name"
					value="<%=rs.getString("name")%>"></td>
			</tr>
			<tr>
				<td align="right">Email:</td>
				<td align="left"><input type="email" name="email"
					value="<%=rs.getString("email")%>"></td>
			</tr>
			<tr>
				<td align="right">Phone:</td>
				<td align="left"><input type="number" name="phone"
					value="<%=rs.getInt("phone")%>"></td>
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
					String query = "select name from manager";
				ps = connection.prepareStatement(query);
				ResultSet rs1 = ps.executeQuery();
				while (rs1.next()) {
				%>
						<option value="<%=rs1.getString("name")%>"><%=rs1.getString("name")%></option>
				<%} %>>
				</select>

			</tr>
			<tr>
				<td></td>
				<td align="justify"><input type="submit" value="Apply"></td>
			</tr>
		</table>
	</form>
	<%
		}
	%>
</body>
</html>