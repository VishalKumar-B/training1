<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Query Status</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome To View Query Status</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2" id="t1">
		<tr>
			<td style='border: none' colspan="7"><input type="button" id="b1"
				value="&#8592; back" onclick="location.href='owner_home.jsp'">
		</tr>
		<tr>
			<th>Query Id:</th>
			<th>Owner Id:</th>
			<th>Owner Name:</th>
			<th>Owner Email:</th>
			<th>Flat Number:</th>
			<th>complaint:</th>
			<th>status:</th>
		</tr>


		<%@page
			import="com.motivity.owner.CheckQueryStatusBean,
			com.motivity.owner.QueryPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
			CheckQueryStatusBean cqsb = new CheckQueryStatusBean();
		int owner_id = (Integer) session.getAttribute("owner_id");
		List<QueryPOJO> list = cqsb.getstatus(owner_id);
		for (QueryPOJO qp : list) {
		%>
		<tr>
			<td><%=qp.getQuery_id()%></td>
			<td><%=qp.getOwner_id()%></td>
			<td><%=qp.getOwner_name()%></td>
			<td><%=qp.getOwner_email() %></td>
			<td><%=qp.getOwner_flat_number()%></td>
			<td><%=qp.getComplaint()%></td>
			<td><%=qp.getStatus()%></td>
		</tr>


		<%
			}
		if (list.isEmpty()) {
		%>
		<tr>
			<td colspan="10" align="center"><label style="color: red">No
					no queries exist</label></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>