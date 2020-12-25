<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome to Payment:</h1>
	</center>
	<br>
	<br>
	<form action="./OwnerPaymentController" method="post">
	<table align="center" cellpadding="2">
		<%@page
			import="com.motivity.owner.OwnerProfileBean,
			com.motivity.owner.OwnerPOJO
			,java.util.ArrayList,java.util.List,java.time.LocalDate"%>
		<%
			OwnerProfileBean opb = new OwnerProfileBean();
		int id = (Integer) session.getAttribute("owner_id");
		List<OwnerPOJO> list = opb.getdetails(id);
		for (OwnerPOJO sgp : list) {
		%>
		<tr>
			<td align="right">Id:</td>
			<td align="left"><input type="number" name="owner_id"
				value="<%=sgp.getId()%>" readonly></td>
		</tr>
		<tr>
			<td align="right">Name:</td>
			<td align="left"><input type="text" name="owner_name"
				value="<%=sgp.getName()%>" readonly></td>
		</tr>
		<tr>
			<td align="right">Email:</td>
			<td align="left"><input type="email" name="email_id"
				value="<%=sgp.getEmailid()%>" readonly></td>
		</tr>
		<tr>
			<td align="right">Flat Number:</td>
			<td align="left"><input type="number" name="flat_number"
				value="<%=sgp.getFlatnumber()%>" readonly></td>
		</tr>

		<%
			String s = sgp.getFlattype();
		int rent = 0;
		if (s.equals("1BHK"))
			rent = 10000;
		else if (s.equals("2BHK"))
			rent = 15000;
		else if (s.equals("3BHK"))
			rent = 20000;
		%>
		<tr>
			<td align="right">Amount:</td>
			<td align="left"><input type="number" name="amount"
				value=<%=rent%> readonly></td>
		</tr>
		<%
		LocalDate ld = LocalDate.now();
		String date = ld.toString();
		%>
		<tr>
		<td align="right">Date:</td>
		<td align="left"><input type="text" name="date" value="<%=date %>" readonly></td>
		</tr>
		<tr>
			<td align="right">Select Card:</td>
			<td align="left"><select name="card_type">
					<option value="none" selected disabled hidden>-select-</option>
					<option value="creditcard">CreditCard</option>
					<option value="debitcard">DebitCard</option>
			</select></td>
		</tr>
		<tr>
			<td align="right">Enter CardNumber:</td>
			<td align="left"><input type="number" name="card_number"
				placeholder="enter card number"></td>
		</tr>
		<tr>
			<td align="right" style='border: none'><input type="button"
				value="&#8592; back" onclick="location.href='owner_home.jsp'"></td>
			<td align="left"><input type="submit" value="proceed to pay"></td>
		</tr>
		<%
			}
		%>
	</table>
	</form>
</body>
</html>