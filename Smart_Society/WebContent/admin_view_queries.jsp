<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back" onclick="location.href='admin_home.jsp'">
		</tr>
		<tr>
			<td>Query Id:</td>
			<td>Owner Id:</td>
			<td>Owner Name:</td>
			<td>Owner Email:</td>
			<td>Owner FlatNumber:</td>
			<td>Query:</td>
			<td>Status:</td>
			<td>Update Status:</td>
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
					<select name="update_value">
						<option value="none" selected disabled hidden>-select-</option>
						<option value="accepted">accepted</option>
						<option value="working on it">working</option>
						<option value="fixed">fixed</option>
					</select> <input type="submit" value="update">
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