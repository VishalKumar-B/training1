<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Appointments</title>
</head>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h1>View Appointment Details</h1>
	<br>
	<a href="/KIMSMVCAnnotations/doctor_home">Home</a> |
	<a href="/KIMSMVCAnnotations/doctor_profile">Profile</a> |
	<a href="/KIMSMVCAnnotations/view_appointment_details">Appointment
		Details</a> |
	<a href="/KIMSMVCAnnotations/index">Logout</a>
	<br>
	<br>
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
			<td>Action</td>
		</tr>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<c:forEach var="a" items="${appointments_list}">
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
				<c:if test="${a.getStatus() == 'Accepted'}">
					<td>Accepted</td>
				</c:if>
				<c:if test="${a.getStatus() != 'Accepted'}">
					<td><a href="/KIMSMVCAnnotations/accept_appointment/${a.getAid()}">Accept</a></td>
				</c:if>

			</tr>
		</c:forEach>
</body>
</html>