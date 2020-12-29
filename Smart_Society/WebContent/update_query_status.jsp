<%@page import="com.motivity.admin.UpdateQueryStatus"%>
<%
	
int query_id=Integer.parseInt(request.getParameter("query_id"));
String updatevalue=request.getParameter("update_value");
UpdateQueryStatus uqs = new UpdateQueryStatus();
int a = uqs.update(query_id,updatevalue);
if (a > 0)
	response.sendRedirect("admin_view_queries.jsp?msg=updated");
else
	response.sendRedirect("admin_view_queries.jsp?msg=failed");
%>
