<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Payment History</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome To Payment History</h1>
	</center>
	<br>
	<br>
	<table align="center" border="1.0" cellpadding="2" id="t1">
		<tr>
			<td style='border: none' colspan="8"><input type="button" id="b1"
				value="&#8592; back" onclick="location.href='owner_home.jsp'">
		</tr>
		<tr>
			<th>PaymentId:</th>
			<th>Name:</th>
			<th>Email:</th>
			<th>FlatNumber:</th>
			<th>Date Of Payment:</th>
			<th>Amount:</th>
			<th>Card Type:</th>
			<th>Card Number:</th>
		</tr>


		<%@page
			import="com.motivity.owner.OwnerViewPaymentHistoryBean,
			com.motivity.owner.PaymentPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
			int owner_id = (Integer) session.getAttribute("owner_id");
		OwnerViewPaymentHistoryBean ovph = new OwnerViewPaymentHistoryBean();
		List<PaymentPOJO> list = ovph.getdetails(owner_id);
		for (PaymentPOJO pp : list) {
		%>
		<tr>
			<td><%=pp.getPayment_id()%></td>
			<td><%=pp.getOwner_name()%></td>
			<td><%=pp.getEmail_id()%></td>
			<td><%=pp.getFlat_number()%>
			<td><%=pp.getDate()%></td>
			<td><%=pp.getAmount()%></td>
			<td><%=pp.getCard_type()%></td>
			<td><%=pp.getCard_number()%></td>
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