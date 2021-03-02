<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Profile</title>
</head>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h1>Doctor Profile</h1>
	<br>
	<a href="/KIMSMVCAnnotations/doctor_home">Home</a> |
	<a href="/KIMSMVCAnnotations/doctor_profile">Profile</a> |
	<a href="/KIMSMVCAnnotations/view_appointment_details">Appointment Details</a> |
	<a href="/KIMSMVCAnnotations/index">Logout</a>
	<br><br>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Specialisation</td>
			<td>Action</td>
		</tr>
		<tr>
			<td>${doctor.getId()}</td>
			<td>${doctor.getName()}</td>
			<td>${doctor.getEmail()}</td>
			<td>${doctor.getPhone()}</td>
			<td>${doctor.getSpecialisation()}</td>
			<td><a href="/KIMSMVCAnnotations/doctor_profile_update">update</a></td>
		</tr>
</body>
</html>