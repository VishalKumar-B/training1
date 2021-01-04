<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Queries</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome To View Query Details</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2" id="t1">
		<tr>
			<td style='border: none' colspan="8"><input type="button" id="b1"
				value="&#8592; back" onclick="location.href='admin_home.jsp'">
		</tr>
		<tr>
			<th>Query Id:</th>
			<th>Owner Id:</th>
			<th>Owner Name:</th>
			<th>Owner Email:</th>
			<th>Owner FlatNumber:</th>
			<th>Query:</th>
			<th>Status:</th>
			<th>Update Status:</th>
		</tr>


		<%@page
			import="com.motivity.admin.AdminViewQueriesBean,
			com.motivity.owner.QueryPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
			AdminViewQueriesBean avqb = new AdminViewQueriesBean();
		List<QueryPOJO> list = avqb.getdetails();
		for (QueryPOJO qp : list) {
		%>
		<tr>
			<td><%=qp.getQuery_id()%></td>
			<td><%=qp.getOwner_id()%></td>
			<td><%=qp.getOwner_name()%></td>
			<td><%=qp.getOwner_email()%></td>
			<td><%=qp.getOwner_flat_number()%></td>
			<td><%=qp.getComplaint()%></td>
			<td><%=qp.getStatus()%></td>
			<td><form action="update_query_status.jsp" method="post">
					<input type="hidden" name="query_id" value="<%=qp.getQuery_id()%>">
					<input type=text name="update_value" id="l2"
						placeholder="enter update status"> <input type="submit" id="b1"
						value="update">
				</form></td>
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