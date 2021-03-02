<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Profile Update</title>
</head>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h1>Patient Profile Update</h1>
	<br>
	<a href="/KIMSSpringMVCHibernate/patient_home">Home</a> |
	<a href="/KIMSSpringMVCHibernate/patient_profile">Profile</a> |
	<a href="/KIMSSpringMVCHibernate/appointment">Appointment</a> |
	<a href="/KIMSSpringMVCHibernate/view_appointment_status">Appointment Status</a> |
	<a href="/KIMSSpringMVCHibernate/index">Logout</a>
	<br><br>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form action="/KIMSSpringMVCHibernate/update_patient_profile"
		method="post" modelAttribute="patient">
		<form:input path="name" placeholder="enter name" />
		<form:input path="email" placeholder="enter email" />
		<form:input path="phone" placeholder="enter phone" />
		<input type="submit" value="update" />
	</form:form>
</body>
</html>