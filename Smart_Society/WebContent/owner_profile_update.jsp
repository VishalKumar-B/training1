<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Owner Profile Update</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<center>
		<h2>Welcome To Owner Profile Update</h2>
	</center>
	<br>
	<form action="./OwnerProfileUpdateController" method="post" align="center">
		<br>
		<table align="center">

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
			<tr>
			<td align="right">Id:</td>
				<td align="left"><input type="text" name="id" id="l1" value="<%=sgp.getId() %>" readonly></td>
			</tr>
			<tr>
				<td align="right">Name:</td>
				<td align="left"><input type="text" name="name" id="l1" value="<%=sgp.getName() %>"></td>
			</tr>
			<tr>
				<td align="right">email id:</td>
				<td align="left"><input type="email" name="email" id="l1"
					value="<%=sgp.getEmailid() %>"></td>
			</tr>
			<tr>
				<td align="right">Mobile Number:</td>
				<td align="left"><input type="text" name="mobilenumber" id="l1"
					value="<%=sgp.getMobilenumber() %>"></td>
			</tr>
			<tr>
				<td align="right">Password:</td>
				<td align="left"><input type="password" name="password" id="l1"
					placeholder="Enter password to update"></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="&#8592; back" id="b1"
					onclick="location.href='owner_profile.jsp'"></td>
				<td align="left"><input type="submit" value="Update" id="b1"></td>
			</tr>

			<%
				}
			%>
		</table>
	</form>
</body>
</html>