<html>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h2>Patient Register</h2>
	<br>
	<br>
	<a href="/KIMSSpringMVCHibernate/index">Home</a> |
	<a href="/KIMSSpringMVCHibernate/doctor_register">Doctor Register</a> |
	<a href="/KIMSSpringMVCHibernate/patient_register">Patient Register</a> |
	<a href="/KIMSSpringMVCHibernate/doctor_login">Doctor Login</a> |
	<a href="/KIMSSpringMVCHibernate/patient_login">Patient Login</a>
	<br>
	<br>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="/KIMSSpringMVCHibernate/add_patient" method="post"
		modelAttribute="register">
		<form:input path="name" placeholder="enter name" />
		<form:password path="password" placeholder="enter password" />
		<form:input path="email" placeholder="enter email" />
		<form:input path="phone" placeholder="enter phone" />
		<input type="submit" value="register" />
	</form:form>
</body>
</html>
