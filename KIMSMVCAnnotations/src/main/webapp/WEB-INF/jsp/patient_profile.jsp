<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Profile</title>
</head>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h1>Patient Profile</h1>
	<br>
	<a href="/KIMSMVCAnnotations/patient_home">Home</a> |
	<a href="/KIMSMVCAnnotations/patient_profile">Profile</a> |
	<a href="/KIMSMVCAnnotations/appointment">Appointment</a> |
	<a href="/KIMSMVCAnnotations/view_appointment_status">Appointment Status</a> |
	<a href="/KIMSMVCAnnotations/index">Logout</a>
	<br><br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Action</td>
		</tr>
		<tr>
			<td>${patient.getId()}</td>
			<td>${patient.getName()}</td>
			<td>${patient.getEmail()}</td>
			<td>${patient.getPhone()}</td>
			<td><a href="/KIMSMVCAnnotations/patient_profile_update">update</a></td>
		</tr>
</body>
</html>