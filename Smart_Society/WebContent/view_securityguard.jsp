<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>view securityguard</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Security Guard Profile</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2" id="t1">

		<tr>
			<td style='border: none' colspan="9"><input type="button" id="b1"
				value="&#8592; back" onclick="location.href='admin_home.jsp'"></td>
		</tr>
		<tr>
			<th>Id:</th>
			<th>Name:</th>
			<th>Phone:</th>
			<th>Email:</th>
			<th>Address</th>
			<th>Education:</th>
			<th>Aadhar:</th>
			<th>Experience:</th>
			<th>Action:</th>
		<tr>
			<%@page
				import="com.motivity.admin.ViewSecurityGuardBean,
			com.motivity.securityguard.SecurityGuardPOJO
			,java.util.ArrayList,java.util.List"%>
			<%
				ViewSecurityGuardBean odb = new ViewSecurityGuardBean();
			List<SecurityGuardPOJO> list = odb.getdetails();
			for (SecurityGuardPOJO sp : list) {
			%>
		
		<tr>
			<td><%=sp.getSecurityguard_id()%></td>
			<td><%=sp.getSecurityguard_name()%></td>
			<td><%=sp.getSecurityguard_phone()%></td>
			<td><%=sp.getSecurityguard_email()%></td>
			<td><%=sp.getSecurityguard_address()%></td>
			<td><%=sp.getSecurityguard_education()%></td>
			<td><%=sp.getSecurityguard_aadhar()%></td>
			<td><%=sp.getSecurityguard_experience()%></td>
			<td><input type="button" value="update" id="b1"
				onclick="location.href='securityguard_profile_update.jsp?id=<%=sp.getSecurityguard_id()%>'"> &nbsp&nbsp
				<input type="button" value="delete" id="b1"
				onclick="location.href='delete_securityguard.jsp?id=<%=sp.getSecurityguard_id()%>'">
			</td>
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
