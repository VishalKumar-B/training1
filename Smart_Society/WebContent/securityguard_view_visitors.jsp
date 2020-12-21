<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visitors</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome To View Visitors</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back"
				onclick="location.href='securityguard_home.jsp'">
		</tr>
		<tr>
			<td>Visitor Id:</td>
			<td>Visitor Name:</td>
			<td>Visitor Mobile:</td>
			<td>visitor Aadhar:</td>
			<td>Visit Time:</td>
			<td>To Visit Name:</td>
			<td>Flat Number:</td>
		</tr>


		<%@page
			import="com.motivity.securityguard.SecurityGuardViewVisitorsBean,
			com.motivity.securityguard.VisitorsPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
			SecurityGuardViewVisitorsBean odb = new SecurityGuardViewVisitorsBean();
		List<VisitorsPOJO> list = odb.getdetails();
		for (VisitorsPOJO vp : list) {
		%>

		<tr>
			<td><%=vp.getVisitor_id()%></td>
			<td><%=vp.getVisitor_name()%></td>
			<td><%=vp.getVisitor_mobile()%></td>
			<td><%=vp.getVisitor_aadhar_id()%></td>
			<td><%=vp.getVisitor_visit_time()%></td>
			<td><%=vp.getVisitor_visit_name()%></td>
			<td><%=vp.getVisitor_visit_flat()%></td>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>