<%@ page import="com.motivity.patient.PatientProfileUpdateBean"%>
<%
	int id = (Integer) session.getAttribute("sid");
String name = request.getParameter("name");
String email = request.getParameter("email");
int age = Integer.parseInt(request.getParameter("age"));
String phone = request.getParameter("phone");

PatientProfileUpdateBean ppu = new PatientProfileUpdateBean();
ppu.setId(id);
ppu.setName(name);
ppu.setEmail(email);
ppu.setAge(age);
ppu.setPhone(phone);


boolean status = false;

status = ppu.patientProfileUpdateDisplay();

if (status)
	response.sendRedirect("Patient_Profile.jsp?msg=updated");
else
	response.sendRedirect("Patient_Profile_Update.jsp?msg=failed");
%>