<%@page import="com.motivity.owner.OwnerProfileBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to OWNER Profile</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back"
				onclick="location.href='owner_home.jsp'">
		</tr>
		<tr>
			<td>Id:</td>
			<td>Name:</td>
			<td>Email:</td>
			<td>flattype</td>
			<td>FlatNumber</td>
			<td>Adhar Number</td>
			
			<td>Phone:</td>
			<td>Gender</td>
			<td>password</td>
			<td>DateOfJoining:</td>
			<td>FloorNumber:</td>
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
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>