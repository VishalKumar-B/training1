<%@page import="com.motivity.doctor.AcceptAppointmentBean"%>
<%
	int aid = Integer.parseInt(request.getParameter("id"));
String name = (String) session.getAttribute("sname");

AcceptAppointmentBean aab = new AcceptAppointmentBean();
aab.setAid(aid);
aab.setDoctor_name(name);

boolean status = false;

status = aab.acceptAppointment();

if (status)
	response.sendRedirect("View_Appointment.jsp?msg=Accepted");
else
	response.sendRedirect("Accept_Appointment.jsp?msg=failed");
%>