<%@ include file="connection.jsp"%>
<%
	String name = request.getParameter("name");
String email = request.getParameter("email");
long phone = Long.parseLong(request.getParameter("phone"));
int no_of_days = Integer.parseInt(request.getParameter("no_of_days"));
String from_date = request.getParameter("from_date");
String to_date = request.getParameter("to_date");
int eid = (Integer) session.getAttribute("eid");
String manager_name=request.getParameter("manager_name");
String sql = "insert into leaves(name,email,phone,no_of_days,from_Date,to_date,eid,manager_name) values(?,?,?,?,?,?,?,?)";
ps = connection.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, email);
ps.setLong(3, phone);
ps.setInt(4, no_of_days);
ps.setString(5, from_date);
ps.setString(6, to_date);
ps.setInt(7, eid);
ps.setString(8, manager_name);
int a = ps.executeUpdate();
if (a != 0)
	response.sendRedirect("Leave_Application.jsp?msg=applied successfully");
%>