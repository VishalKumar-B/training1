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
		<h1>Welcome To Payment Details</h1>
	</center>
	<br>
	<br>
	<form action="payment_details_search.jsp">
		<center>
			From:<input type="date" name="from_date"> To:<input type="date"
				name="to_date"> <input type="submit" value="search">
			<input type="button" value="view all"
				onclick="location.href='admin_view_payments.jsp'">
		</center>
	</form>
	<br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td style='border: none'><input type="button"
				value="&#8592; back" onclick="location.href='admin_home.jsp'">
		</tr>
		<tr>
			<td>Payment Id:</td>
			<td>Owner Id:</td>
			<td>Owner Name:</td>
			<td>Owner Email:</td>
			<td>Owner FlatNumber:</td>
			<td>Date Of Payment:</td>
			<td>Amount:</td>
			<td>Card Type:</td>
			<td>Card Number:</td>
		</tr>


		<%@page
			import="com.motivity.owner.OwnerViewPaymentHistoryBean,
			com.motivity.owner.PaymentPOJO
			,java.util.ArrayList,java.util.List"%>
		<%
		String from_date = request.getParameter("from_date");
		String to_date = request.getParameter("to_date");
		OwnerViewPaymentHistoryBean ovph = new OwnerViewPaymentHistoryBean();
		List<PaymentPOJO> list = ovph.getdetails(from_date,to_date);
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