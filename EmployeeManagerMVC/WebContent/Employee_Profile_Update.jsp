<%@page import="com.motivity.employee.EmployeeProfileUpdateBean"%>
<%
	int eid = (Integer) session.getAttribute("eid");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String date_of_birth = request.getParameter("date_of_birth");
int age = Integer.parseInt(request.getParameter("age"));
String gender = request.getParameter("gender");
String designation = request.getParameter("designation");
int experience = Integer.parseInt(request.getParameter("experience"));

EmployeeProfileUpdateBean epu = new EmployeeProfileUpdateBean();

epu.setEid(eid);
epu.setName(name);
epu.setEmail(email);
epu.setPhone(phone);
epu.setDate_of_birth(date_of_birth);
epu.setAge(age);
epu.setGender(gender);
epu.setDesignation(designation);
epu.setExperience(experience);

boolean status = false;

status = epu.employeeProfileUpdate();

if (status)
	response.sendRedirect("./Employee_Profile.jsp?msg=updated sucessfully");
else
	response.sendRedirect("./Employee_Profile_Update_Display.jsp?msg=update failed");
%>