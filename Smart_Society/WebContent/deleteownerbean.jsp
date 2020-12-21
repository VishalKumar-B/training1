<%@page import="com.motivity.admin.DeleteOwnerBean"%>
<%
	int id = Integer.parseInt(request.getParameter("id"));
DeleteOwnerBean odb = new DeleteOwnerBean();
int a = odb.delete(id);
if (a > 0)
	response.sendRedirect("owner_details.jsp?msg=deleted");
else
	response.sendRedirect("owner_details.jsp?msg=failed");
%>