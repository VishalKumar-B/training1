<%@page import="com.motivity.manager.AcceptLeaveBean"%>
<%
	int eid = (Integer) session.getAttribute("eid");
int no_of_days = (Integer) session.getAttribute("no_of_days");

AcceptLeaveBean alb = new AcceptLeaveBean();
alb.setEid(eid);
alb.setNo_of_days(no_of_days);

boolean status = false;

status=alb.acceptLeave();

if(status)
	response.sendRedirect("View_Leaves.jsp?msg=accepted");

%>