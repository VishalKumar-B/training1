<%@include file="connection.jsp"%>
<%
	int lid = Integer.parseInt(request.getParameter("lid"));
String sql = "update leaves set status=? where lid=?";
ps = connection.prepareStatement(sql);
ps.setString(1, "Rejected");
ps.setInt(2, lid);
int x = ps.executeUpdate();
if (x != 0)
	response.sendRedirect("View_Leaves.jsp?msg=Rejected");
%>