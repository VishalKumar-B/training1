<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
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
	<table align="center" border="1.0" cellpadding="2" id="t1">
		<tr>
			<td style='border: none' colspan="7"><input type="button"
				value="&#8592; back" id="b1"
				onclick="location.href='securityguard_home.jsp'">
		</tr>
		<tr>
			<th>Visitor Id:</th>
			<th>Visitor Name:</th>
			<th>Visitor Mobile:</th>
			<th>visitor Aadhar:</th>
			<th>Visit Time:</th>
			<th>To Visit Name:</th>
			<th>Flat Number:</th>
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
		if (list.isEmpty()) {
		%>
		<tr>
			<td colspan="10" align="center"><label style="color: red">No
					records exist</label></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>