<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back" onclick="location.href='admin_home.jsp'">
		</tr>
		<tr>
			<td>Id:</td>
			<td>Name:</td>
			<td>Phone:</td>
			<td>Email:</td>
			<td>Address</td>
			<td>Education:</td>
			<td>Aadhar:</td>
			<td>Experience:</td>
			<td>Action:</td>
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
			<td><a
				href="deletesecurityguardbean.jsp?id=<%=sp.getSecurityguard_id()%>">delete</a></td>
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