<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Raise a Query</title>
<style>
textarea {
	resize: none;
}
</style>
</head>
<body bgcolor="C5EEF9">
	<br>
	<center>
		<h2>Welcome To Raise a Query</h2>
	</center>
	<br>
	<form action="./RaiseQueryController" method="post" align="center">
		<br>

		<%@page
			import="com.motivity.owner.OwnerProfileBean,
			com.motivity.owner.OwnerPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
			OwnerProfileBean opb = new OwnerProfileBean();
		int id = (Integer) session.getAttribute("owner_id");
		List<OwnerPOJO> list = opb.getdetails(id);
		for (OwnerPOJO sgp : list) {
		%>

		<table align="center">
			<tr>
				<td align="right">Id:</td>
				<td align="left"><input type="text" name="owner_id"
					value="<%=sgp.getId()%>" readonly></td>
			</tr>
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="owner_name"
					value="<%=sgp.getName()%>" readonly></td>
			</tr>
			<tr>
				<td align="right">E-mail:</td>
				<td align="left"><input type="email" name="owner_email"
					value="<%=sgp.getEmailid()%>" readonly></td>
			</tr>
			<tr>
				<td align="right">Flat Number:</td>
				<td align="left"><input type="text" name="owner_flat_number"
					value="<%=sgp.getFlatnumber()%>" readonly></td>
			</tr>
			<tr>
				<td align="right">Complaint:</td>
				<td align="left"><textarea rows="6" cols="66" name="query"
						placeholder="query should be less than 500 characters"
						maxlength="500"></textarea></td>
			</tr>

			<td align="right"><input type="button" value="&#8592; back"
				onclick="location.href='owner_home.jsp'"></td>
			<td align="left"><input type="submit" value="Raise"></td>
			</tr>
		</table>
		<%
			}
		%>
	
</body>
</html>