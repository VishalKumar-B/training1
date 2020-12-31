<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Maintenance Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome To View Maintenance amount Details</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back" onclick="location.href='admin_home.jsp'">
		</tr>
		<tr>
			<td>Flat Type:</td>
			<td>Maintenance Amount:</td>
			<td>Update Maintenance Amount:</td>
		</tr>
		<%@page
			import="com.motivity.admin.ViewRentBean,
			com.motivity.admin.RentPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
			ViewRentBean vrb = new ViewRentBean();
		List<RentPOJO> list = vrb.getdetails();
		for (RentPOJO rp : list) {
		%>
		<tr>
			<td><%=rp.getFlat_type()%></td>
			<td><%=rp.getRent()%></td>
			<td><form action="update_rent.jsp" method="post">
					<input type="hidden" name="flat_type" value="<%=rp.getFlat_type()%>">
					<input type="number" name="update_value"
						placeholder="enter new rent amount"> <input type="submit"
						value="update">
				</form></td>
		</tr>


		<%
			}
		%>
	</table>
</body>
</html>
