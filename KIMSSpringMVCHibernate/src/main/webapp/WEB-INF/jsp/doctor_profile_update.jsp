<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Profile Update</title>
</head>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h1>Doctor Profile Update</h1>
	<br>
	<a href="/KIMSSpringMVCHibernate/doctor_home">Home</a> |
	<a href="/KIMSSpringMVCHibernate/doctor_profile">Profile</a> |
	<a href="/KIMSSpringMVCHibernate/view_appointment_details">Appointment
		Details</a> |
	<a href="/KIMSSpringMVCHibernate/index">Logout</a>
	<br>
	<br>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form action="/KIMSSpringMVCHibernate/update_doctor_profile"
		method="post" modelAttribute="doctor">
		<form:input path="name" placeholder="enter name" />
		<form:input path="email" placeholder="enter email" />
		<form:input path="phone" placeholder="enter phone" />
		<form:select path="specialisation">
			<form:option value="ENT">ENT</form:option>
			<form:option value="Cardio">Cardio</form:option>
			<form:option value="Dentist">Dentist</form:option>
		</form:select>
		<input type="submit" value="update" />
	</form:form>
</body>
</html>