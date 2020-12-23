<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Owner Details:</h1>
	</center>
	<br>
	<br>

	<table align="center" border="1.0" cellpadding="2">
		<form action="owner_details_search.jsp">
			<center>
				<input type="text" placeholder="search by flat number"
					name="flat_number"> <input type="submit" value="search">
				<input type="button" value="view all"
					onclick="location.href='owner_details.jsp'">
			</center>
		</form>
		<br>
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back" onclick="location.href='admin_home.jsp'">
		</tr>
		<tr>
			<td>Id:</td>
			<td>Name:</td>
			<td>Email:</td>
			<td>Flat Number:</td>
			<td>DOJ:</td>
			<td>Aadhar:</td>
			<td>Flat Type:</td>
			<td>Floor Number:</td>
			<td>Gender:</td>
			<td>Action</td>
		<tr>
			<%@page
				import="com.motivity.owner.OwnerPOJO,
			com.motivity.admin.OwnerDetailsBean
			,java.util.ArrayList,java.util.List"%>
			<%
				int flat_number = Integer.parseInt(request.getParameter("flat_number"));
			OwnerDetailsBean odb = new OwnerDetailsBean();
			List<OwnerPOJO> list = odb.getdetails(flat_number);
			for (OwnerPOJO op : list) {
			%>
		
		<tr>
			<td><%=op.getId()%></td>
			<td><%=op.getName()%></td>
			<td><%=op.getEmailid()%></td>
			<td><%=op.getFlatnumber()%></td>
			<td><%=op.getDateofjoing()%></td>
			<td><%=op.getAdharnumber()%></td>
			<td><%=op.getFlattype()%></td>
			<td><%=op.getFloornumber()%>
			<td><%=op.getGender()%></td>
			<td><a href="deleteownerbean.jsp?id=<%=op.getId()%>">delete</a></td>
		</tr>
		<%
			}
		if (list.isEmpty()) {
		%>
		<tr>
			<td colspan="10" align="center"><label style="color: red">No records exist</label></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>