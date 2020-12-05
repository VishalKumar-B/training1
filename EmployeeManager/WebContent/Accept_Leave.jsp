<%@include file="connection.jsp"%>
<%
int eid = (Integer)session.getAttribute("eid");
int no_of_days = (Integer)session.getAttribute("no_of_days");
String sql = "update leaves set status=? where eid=?";
ps = connection.prepareStatement(sql);
ps.setString(1, "Accepted");
ps.setInt(2, eid);
int x = ps.executeUpdate();
if (x != 0)	{
ps=connection.prepareStatement("update employee set leaves_remaining=leaves_remaining-? where eid=?");
ps.setInt(1, no_of_days);
ps.setInt(2, eid);
int a =ps.executeUpdate();
if(x!=0)
	System.out.println("leaves updated");

response.sendRedirect("View_Leaves.jsp?msg=accepted");
}
%>