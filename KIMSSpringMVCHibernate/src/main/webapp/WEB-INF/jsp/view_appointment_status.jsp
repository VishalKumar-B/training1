<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment Status</title>
</head>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h1>Appointment Status</h1>
	<br>
	<a href="/KIMSSpringMVCHibernate/patient_home">Home</a> |
	<a href="/KIMSSpringMVCHibernate/patient_profile">Profile</a> |
	<a href="/KIMSSpringMVCHibernate/appointment">Appointment</a> |
	<a href="/KIMSSpringMVCHibernate/view_appointment_status">Appointment Status</a> |
	<a href="/KIMSSpringMVCHibernate/index">Logout</a>
	<br><br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Phone</td>
			<td>Email</td>
			<td>Specialist</td>
			<td>Date</td>
			<td>Time</td>
			<td>Doctor Name</td>
			<td>Status</td>
		</tr>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<c:forEach var="a" items="${list}">
		<tr>
		<td>${a.getAid()}</td>
		<td>${a.getPname()}</td>
		<td>${a.getPhone()}</td>
		<td>${a.getEmail()}</td>
		<td>${a.getSpecialist()}</td>
		<td>${a.getDate()}</td>
		<td>${a.getTime()}</td>
		<td>${a.getDoctorname()}</td>
		<td>${a.getStatus()}</td>
		</tr>
		</c:forEach>
</body>
</html>