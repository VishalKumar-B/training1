<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
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

	<table align="center" border="1.0" cellpadding="2" id="t1">
		<form action="owner_details_search.jsp">
			<center>
				<input type="number" placeholder="search by flat number" id="l2"
					name="flat_number"> <input type="submit" value="search"
					id="b1"> <input type="button" value="view all" id="b1"
					onclick="location.href='owner_details.jsp'">
			</center>
		</form>
		<br>
		<tr>
			<td style='border: none' colspan="10"><input type="button"
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
			int flat_number;
			String s = request.getParameter("flat_number");
			if (s.equals(""))
				 flat_number = 0;
			else	
			flat_number = Integer.parseInt(request.getParameter("flat_number"));
			
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
			<td><input type="button" value="delete" id="b1"
				onclick="location.href='deleteownerbean.jsp?id=<%=op.getId()%>'">
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