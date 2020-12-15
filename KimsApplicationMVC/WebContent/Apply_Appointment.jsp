<%@page import="com.motivity.patient.ApplyAppointmentBean"%>
<%
	int id = (Integer) session.getAttribute("sid");
String name = request.getParameter("name");
String phone = request.getParameter("phone");
String email = request.getParameter("email");
String gender = request.getParameter("gender");
String blood_group = request.getParameter("blood_group");
String specialist = request.getParameter("specialist");
String date_of_appointment = request.getParameter("date_of_appointment");
String time_of_appointment = request.getParameter("time_of_appointment");

ApplyAppointmentBean aab = new ApplyAppointmentBean();

aab.setId(id);
aab.setName(name);
aab.setPhone(phone);
aab.setEmail(email);
aab.setGender(gender);
aab.setBlood_group(blood_group);
aab.setSpecialist(specialist);
aab.setDate_of_appointment(date_of_appointment);
aab.setTime_of_appointment(time_of_appointment);

boolean status = false;

status = aab.applyAppointment();

if (status)
	response.sendRedirect("Appointment.jsp?msg=appointment_applied");
else 
	response.sendRedirect("Apply_Appointment.jsp?msg=failed");
%>