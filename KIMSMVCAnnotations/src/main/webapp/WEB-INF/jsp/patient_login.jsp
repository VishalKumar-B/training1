<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Login</title>
</head>
<body align="center" bgcolor="lightblue">
	<br>
	<br>
	<h1>Patient Login</h1>
	<br>
	<br>
	<a href="/KIMSMVCAnnotations/index">Home</a> |
	<a href="/KIMSMVCAnnotations/doctor_register">Doctor Register</a> |
	<a href="/KIMSMVCAnnotations/patient_register">Patient Register</a> |
	<a href="/KIMSMVCAnnotations/doctor_login">Doctor Login</a> |
	<a href="/KIMSMVCAnnotations/patient_login">Patient Login</a>
	<br>
	<br>
	<form action="/KIMSMVCAnnotations/plogin" method="post">
		<input type="email" placeholder="enter email" name="email" /> <input
			type="password" placeholder="enter password" name="password" /> <input
			type="submit" value="login" />
	</form>
</body>
</html>