<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Appointment</title>
</head>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h1>Book Appointment</h1>
	<br>
	<br>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form action="/KIMSMVCAnnotations/apply_appointment"
		method="post" modelAttribute="appointment" align="center">
		<form:input type="text" path="pname" placeholder="Enter patient name " />
		<form:input type="number" path="phone"
			placeholder="Enter phone number" />
		<form:input type="email" path="email" placeholder="Enter emial" />
		<form:select path="specialist">
			<form:option value="Dentist">Dentist</form:option>
			<form:option value="Cardio">Cardio</form:option>
			<form:option value="ENT">ENT</form:option>
		</form:select>
		<form:input type="date" path="date"
			placeholder="select date for appointment" />
		<form:input type="time" path="time"
			placeholder="select time for appointment" />
		<input type="submit" value="apply">
	</form:form>
	${appointment.getPatient().getId() }
</body>
</html>