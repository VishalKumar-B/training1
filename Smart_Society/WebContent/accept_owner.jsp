<%@page import="com.motivity.admin.AcceptOwnerBean"%>
<%
	int id = Integer.parseInt(request.getParameter("id"));
AcceptOwnerBean aob = new AcceptOwnerBean();
int a = aob.accept(id);
if (a > 0)
	response.sendRedirect("owner_registration_request.jsp?msg=accepted");
else
	response.sendRedirect("owner_registration_request.jsp?=failed");
%>