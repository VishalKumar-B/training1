<%@page import="com.motivity.manager.RejectLeaveBean"%>
<%
	int lid = Integer.parseInt(request.getParameter("lid"));

RejectLeaveBean rlb = new RejectLeaveBean();
rlb.setLid(lid);

boolean status = false;

status = rlb.rejectLeave();

if (status)
	response.sendRedirect("View_Leaves.jsp?msg=Rejected");
%>