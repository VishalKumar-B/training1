<%@page import="com.motivity.employee.ApplyLeaveBean"%>
<%
	String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
int no_of_days = Integer.parseInt(request.getParameter("no_of_days"));
String from_date = request.getParameter("from_date");
String to_date = request.getParameter("to_date");
int eid = (Integer) session.getAttribute("eid");
String manager_name=request.getParameter("manager_name");

ApplyLeaveBean alb = new ApplyLeaveBean();

alb.setName(name);
alb.setEmail(email);
alb.setPhone(phone);
alb.setNo_of_days(no_of_days);
alb.setFrom_date(from_date);
alb.setTo_date(to_date);
alb.setEid(eid);
alb.setManager_name(manager_name);

boolean status = alb.applyLeave();

if (status)
	response.sendRedirect("Leave_Application.jsp?msg=applied successfully");
else
	response.sendRedirect("Leave_Application.jsp?msg=failed");
%>