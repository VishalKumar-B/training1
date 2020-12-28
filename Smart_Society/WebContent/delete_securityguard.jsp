<%@page import="com.motivity.admin.DeleteSecurityGuardBean"%>
<%
	int id = Integer.parseInt(request.getParameter("id"));
DeleteSecurityGuardBean odb = new DeleteSecurityGuardBean();
int a = odb.delete(id);
if (a > 0)
	response.sendRedirect("view_securityguard.jsp?msg=deleted");
else
	response.sendRedirect("view_securityguard.jsp?msg=failed");
%>