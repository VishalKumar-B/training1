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
	<%@include file="connection.jsp" %>
	<%
	   int eid=(Integer) session.getAttribute("eid");
	ps = connection.prepareStatement("select * from employee where eid=?");
	ps.setInt(1, eid);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<form action="./Employee_Profile_Update.jsp" method="post" align="center">
		<table align="center">
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="name"
					value="<%=rs.getString("name")%>"></td>
			</tr>
			<tr>
				<td align="right">Email:</td>
				<td align="left"><input type="email" name="email"
					value="<%=rs.getString("email")%>">
				<td></td>
			<tr>
				<td align="right">Phone:</td>
				<td align="left"><input type="number" name="phone"
					value="<%=rs.getInt("phone")%>"></td>
			</tr>
			<tr>
				<td align="right">Date Of Birth:</td>
				<td align="left"><input type="date" name="date_of_birth" value="<%=rs.getString("date_of_birth")%>"></td>
			</tr>
			<tr>
				<td align="right">Age:</td>
				<td align="left"><input type="number" name="age"
					value="<%=rs.getInt("age")%>"></td>
			</tr>
			<tr>
				<td align="right">Gender:</td>
				<td align="left"><input type="radio" name="gender" value="<%=rs.getString("gender")%>">Male
					<input type="radio" name="gender" value="<%=rs.getString("gender") %>">Female</td>
			</tr>
			<tr>
				<td align="right">Designation:</td>
				<td align="left"><select name="designation">
						<option value="<%=rs.getString("designation")%>"><%=rs.getString("designation")%></option>
						<option value="Software Developer">Software Developer</option>
						<option value="Quality Analyst">Quality Analyst</option>
				</select></td>
			<tr>
			<tr>
				<td align="right">Experience:</td>
				<td align="left"><input type="number" name="experience"
				    value="<%=rs.getInt("experience") %>"></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="Update"></td>
				<td align="left"><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
	<%} %>
</body>
</html>