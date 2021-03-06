<html>
<body bgcolor="lightblue" align="center">
	<br>
	<br>
	<h2>Doctor Register</h2>
	<br>
	<br>
	<a href="/KIMSMVCAnnotations/index">Home</a> |
	<a href="/KIMSMVCAnnotations/doctor_register">Doctor Register</a> |
	<a href="/KIMSMVCAnnotations/patient_register">Patient Register</a> |
	<a href="/KIMSMVCAnnotations/doctor_login">Doctor Login</a> |
	<a href="/KIMSMVCAnnotations/patient_login">Patient Login</a>
	<br>
	<br>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="/KIMSMVCAnnotations/add_doctor" method="post"
		modelAttribute="register">
		<form:input path="name" placeholder="enter name" />
		<form:password path="password" placeholder="enter password" />
		<form:input path="email" placeholder="enter email" />
		<form:input path="phone" placeholder="enter phone" />
		<form:select path="specialisation">
			<form:option value="ENT">ENT</form:option>
			<form:option value="Cardio">Cardio</form:option>
			<form:option value="Dentist">Dentist</form:option>
		</form:select>
		<input type="submit" value="register" />
	</form:form>
</body>
</html>
