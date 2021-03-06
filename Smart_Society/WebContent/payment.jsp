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
		<h1>Welcome to Payment:</h1>
	</center>
	<br>
	<br>
	<form action="./OwnerPaymentController" method="post">
		<div class="myDiv">
			<table align="center" cellpadding="2">
				<%@page
					import="com.motivity.owner.OwnerProfileBean,
			com.motivity.owner.OwnerPOJO,
			com.motivity.admin.ViewRentBean,
			com.motivity.admin.RentPOJO
			,java.util.ArrayList,java.util.List,java.time.LocalDate"%>
				<%
					OwnerProfileBean opb = new OwnerProfileBean();
				int id = (Integer) session.getAttribute("owner_id");
				List<OwnerPOJO> list = opb.getdetails(id);
				for (OwnerPOJO sgp : list) {
				%>
				<tr>
					<td align="right">Id:</td>
					<td align="left"><input type="number" name="owner_id" id="l1"
						value="<%=sgp.getId()%>" readonly></td>
				</tr>
				<tr>
					<td align="right">Name:</td>
					<td align="left"><input type="text" name="owner_name" id="l1"
						value="<%=sgp.getName()%>" readonly></td>
				</tr>
				<tr>
					<td align="right">Email:</td>
					<td align="left"><input type="email" name="email_id" id="l1"
						value="<%=sgp.getEmailid()%>" readonly></td>
				</tr>
				<tr>
					<td align="right">Flat Number:</td>
					<td align="left"><input type="number" name="flat_number"
						id="l1" value="<%=sgp.getFlatnumber()%>" readonly></td>
				</tr>

				<%
					String s = sgp.getFlattype();
				ViewRentBean vrb = new ViewRentBean();
				List<RentPOJO> list1 = vrb.getdetails(s);
				for (RentPOJO rp : list1) {
				%>
				<tr>
					<td align="right">Amount:</td>
					<td align="left"><input type="number" name="amount" id="l1"
						value=<%=rp.getRent()%> readonly></td>
				</tr>
				<%
					}
				LocalDate ld = LocalDate.now();
				String date = ld.toString();
				%>
				<tr>
					<td align="right">Date:</td>
					<td align="left"><input type="text" name="date" id="l1"
						value="<%=date%>" readonly></td>
				</tr>
				<tr>
					<td align="right">Select Card:</td>
					<td align="left"><select name="card_type" id="l1">
							<option value="none" selected disabled hidden>-select-</option>
							<option value="creditcard">CreditCard</option>
							<option value="debitcard">DebitCard</option>
					</select></td>
				</tr>
				<tr>
					<td align="right">Enter CardNumber:</td>
					<td align="left"><input type="number" name="card_number"
						id="l1" placeholder="enter card number"></td>
				</tr>
				<tr>
					<td align="right" style='border: none'><input type="button"
						id="b1" value="&#8592; back"
						onclick="location.href='owner_home.jsp'"></td>
					<td align="left"><input type="submit" value="proceed to pay"
						id="b1"></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
	</form>
</body>
</html>