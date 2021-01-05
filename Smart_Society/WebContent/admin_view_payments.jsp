<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/background.css" type="text/css" rel="stylesheet" />
<title>Payment Details</title>
</head>
<body bgcolor="C5EEF9">
	<br>
	<br>
	<center>
		<h1>Welcome To Payment Details</h1>
	</center>
	<br>
	<br>
	<form action="payment_details_search.jsp" method="post">
		<center>
			From: <input type="date" name="from_date" id="l1"> &nbsp To:
			<input type="date" name="to_date" id="l1"> &nbsp <input
				type="submit" value="search" id="b1"> <input type="button"
				value="view all" id="b1"
				onclick="location.href='admin_view_payments.jsp'">

		</center>
	</form>
	<br>
	<table align="center" border="1.0" cellpadding="2" id="t1">
		<tr>
			<td style='border: none' colspan="9"><input type="button"
				value="&#8592; back" id="b1"
				onclick="location.href='admin_home.jsp'">
		</tr>
		<tr>
			<th>Payment Id:</th>
			<th>Owner Id:</th>
			<th>Owner Name:</th>
			<th>Owner Email:</th>
			<th>Owner FlatNumber:</th>
			<th>Date Of Payment:</th>
			<th>Amount:</th>
			<th>Card Type:</th>
			<th>Card Number:</th>
		</tr>


		<%@page
			import="com.motivity.owner.OwnerViewPaymentHistoryBean,
			com.motivity.owner.PaymentPOJO
			,java.util.ArrayList,java.util.List,java.util.*"%>
		<%
			OwnerViewPaymentHistoryBean ovph = new OwnerViewPaymentHistoryBean();
		List<PaymentPOJO> list = ovph.getdetails();
		for (PaymentPOJO pp : list) {
		%>
		<tr>
			<td><%=pp.getPayment_id()%></td>
			<td><%=pp.getOwner_id()%></td>
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