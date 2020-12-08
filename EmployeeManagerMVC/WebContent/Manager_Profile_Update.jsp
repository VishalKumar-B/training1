<%@page import="com.motivity.manager.ManagerProfileUpdateBean"%>
<%
	int mid = (Integer) session.getAttribute("mid");
String name = request.getParameter("name");
String email = request.getParameter("email");
long phone = Long.parseLong(request.getParameter("phone"));
String date_of_birth = request.getParameter("date_of_birth");
int age = Integer.parseInt(request.getParameter("age"));
String gender = request.getParameter("gender");
int experience = Integer.parseInt(request.getParameter("experience"));

ManagerProfileUpdateBean mpu = new ManagerProfileUpdateBean();
mpu.setMid(mid);
mpu.setName(name);
mpu.setEmail(email);
mpu.setPhone(phone);
mpu.setDate_of_birth(date_of_birth);
mpu.setAge(age);
mpu.setGender(gender);
mpu.setExperience(experience);

boolean status = false;

status = mpu.managerProfileUpdate();

if (status)
	response.sendRedirect("./Manager_Profile.jsp?msg=updated sucessfully");
else
	response.sendRedirect("./Manager_Profile_Update_Display.jsp?msg=update failed");
%>