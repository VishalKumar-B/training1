<!DOCTYPE html>
<html>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Manager Profile Update</h1>
		<a href="Manager_Home.html">Home</a> | <a href="Manager_Profile.jsp">Profile</a>
		| <a href="View_Leaves.jsp">Leave Details</a> | <a href="index.html">logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.motivity.manager.ManagerProfileUpdateDisplayBean"%>
	<%
		int mid = (Integer) session.getAttribute("mid");
	ManagerProfileUpdateDisplayBean mpud = new ManagerProfileUpdateDisplayBean();
	mpud.setMid(mid);
	mpud.managerProfileUpdateDisplay();
	%>
	<form action="./Manager_Profile_Update.jsp" method="post"
		align="center">
		<table align="center">
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="name"
					value="<%=mpud.getName()%>"></td>
			</tr>
			<tr>
				<td align="right">Email:</td>
				<td align="left"><input type="email" name="email"
					value="<%=mpud.getEmail()%>">
				<td></td>
			<tr>
				<td align="right">Phone:</td>
				<td align="left"><input type="number" name="phone"
					value="<%=mpud.getPhone()%>"></td>
			</tr>
			<tr>
				<td align="right">Date Of Birth:</td>
				<td align="left"><input type="date" name="date_of_birth"
					value="<%=mpud.getDate_of_birth()%>"></td>
			</tr>
			<tr>
				<td align="right">Age:</td>
				<td align="left"><input type="number" name="age"
					value="<%=mpud.getAge()%>"></td>
			</tr>
			<tr>
				<td align="right">Gender:</td>
				<td align="left"><input type="radio" name="gender"
					value="<%=mpud.getGender()%>">Male <input type="radio"
					name="gender" value="<%=mpud.getGender()%>">Female</td>
			</tr>
			<tr>
				<td align="right">Experience:</td>
				<td align="left"><input type="number" name="experience"
					value="<%=mpud.getExperience()%>"></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="Update"></td>
				<td align="left"><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>