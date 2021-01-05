<%@page import="com.motivity.owner.OwnerProfileBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Owner Profile</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Owner Profile</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2" id="t1">
		<tr>
			<td style='border: none' colspan="12"><input type="button" id="b1"
				value="&#8592; back"
				onclick="location.href='owner_home.jsp'">
		</tr>
		<tr>
			<th>Id:</th>
			<th>Name:</th>
			<th>Email:</th>
			<th>flattype</th>
			<th>FlatNumber</th>
			<th>Aadhar Number</th>
			<th>Phone:</th>
			<th>Gender</th>
			<th>password</th>
			<th>DateOfJoining:</th>
			<th>FloorNumber:</th>
			<th>Update</th>
		<tr>
			<%@page
				import="com.motivity.owner.OwnerProfileBean,
			com.motivity.owner.OwnerPOJO
			,java.util.ArrayList,java.util.List"%>
			<%
			OwnerProfileBean opb = new OwnerProfileBean();
			int id = (Integer)session.getAttribute("owner_id");
			List<OwnerPOJO> list = opb.getdetails(id);
			for (OwnerPOJO sgp : list) {
			%>
		
		<tr>
			<td><%=sgp.getId()%></td>
			<td><%=sgp.getName()%></td>
			<td><%=sgp.getEmailid()%></td>
			<td><%=sgp.getFlattype()%></td>
			<td><%=sgp.getFlatnumber()%></td>
			<td><%=sgp.getAdharnumber()%></td>
			<td><%=sgp.getMobilenumber()%></td>
			<td><%=sgp.getGender()%></td>
			<td><%=sgp.getPassword()%></td>
			<td><%=sgp.getDateofjoing()%></td>
			<td><%=sgp.getFlatnumber()%></td>
			<td>
			<input type="button" id="b1"
				value="update"
				onclick="location.href='owner_profile_update.jsp'">
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>