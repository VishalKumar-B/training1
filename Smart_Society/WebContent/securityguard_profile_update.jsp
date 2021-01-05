<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>securityguard profile update</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Security Guard Profile Update</h1>
	</center>
	<br>
	<br>
	<form action="./SecurityGuardProfileUpdateController" method="post"
		align="center">
		<div class="myDiv">
			<table align="center">

				<%@page
					import="com.motivity.securityguard.SecurityGuardProfileBean,
			com.motivity.securityguard.SecurityGuardPOJO
			,java.util.ArrayList,java.util.List"%>
				<%
					SecurityGuardProfileBean sgpb = new SecurityGuardProfileBean();
				int sid = Integer.parseInt(request.getParameter("id"));
				List<SecurityGuardPOJO> list = sgpb.getdetails(sid);
				for (SecurityGuardPOJO sgp : list) {
				%>
				<tr>
					<td></td>
					<td><input type="hidden" name="securityguard_id"
						value="<%=sgp.getSecurityguard_id()%>"></td>
				</tr>
				<tr>
					<td align="right">Name:</td>
					<td align="left"><input type="text" name="securityguard_name"
						value="<%=sgp.getSecurityguard_name()%>"></td>
				</tr>
				<tr>
					<td align="right">Experience:</td>
					<td align="left"><input type="number"
						name="securityguard_experience"
						value="<%=sgp.getSecurityguard_experience()%>"></td>
				</tr>
				<tr>
					<td align="right">Mobile Number:</td>
					<td align="left"><input type="number"
						name="securityguard_phone"
						value="<%=sgp.getSecurityguard_phone()%>"></td>
				</tr>
				<tr>
					<td align="right">Address:</td>
					<td align="left"><textarea rows="3" cols="22"
							name="securityguard_address" style="resize: none;"><%=sgp.getSecurityguard_address()%></textarea></td>
				</tr>
				<tr>
					<td align="right" style='border: none'><input type="button"
						value="&#8592; back"
						onclick="location.href='view_securityguard.jsp'"></td>
					<td align="left"><input type="submit" value="update"></td>
				</tr>

				<%
					}
				%>
			</table>
		</div>
	</form>
</body>
</html>