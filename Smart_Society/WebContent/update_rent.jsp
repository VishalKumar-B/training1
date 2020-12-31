<%@page import="com.motivity.admin.UpdateRentBean"%>
<%

String update_value = request.getParameter("update_value");
String flat_type = request.getParameter("flat_type");

UpdateRentBean urb = new UpdateRentBean();

int a = urb.updateRent(update_value, flat_type);
if (a > 0)
	response.sendRedirect("view_rent.jsp?msg=updated");
else
	response.sendRedirect("view_rent.jsp?msg=failed");
%>
