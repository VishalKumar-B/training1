<%@ page import="com.motivity.doctor.DoctorProfileUpdateBean"%>

<%
	int id = (Integer) session.getAttribute("sid");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String specialisation = request.getParameter("specialisation");

DoctorProfileUpdateBean dpu = new DoctorProfileUpdateBean();
dpu.setId(id);
dpu.setName(name);
dpu.setEmail(email);
dpu.setPhone(phone);
dpu.setSpecialisation(specialisation);

boolean status = false;

status = dpu.doctorProfileUpdateDisplay();

if (status)
	response.sendRedirect("Doctor_Profile.jsp?msg=updated");
else
	response.sendRedirect("Doctor_Profile_Update_Display.jsp?msg=failed");
%>