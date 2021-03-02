<html>
<body bgcolor="lightblue">
<br><br><br><br>
<h2>Hello World!</h2>
<br><br><br><br>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form action="/SpringMVCHibernate/register" method="post" modelAttribute="register">
<form:input path="username" placeholder="enter username" />
<form:input path="password" placeholder="enter password" />
<form:input path="email" placeholder="enter email" />
<form:input path="phone" placeholder="enter phone" />
<input type="submit" value="register" />
</form:form>
</body>
</html>
