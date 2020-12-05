<%@include file="connection.jsp" %>
<%
int eid = (Integer)session.getAttribute("eid");
String name=request.getParameter("name");
String email=request.getParameter("email");
long phone=Long.parseLong(request.getParameter("phone"));
String date_of_birth=request.getParameter("date_of_birth");
int age = Integer.parseInt(request.getParameter("age"));
String gender=request.getParameter("gender");
String designation=request.getParameter("designation");
int experience=Integer.parseInt(request.getParameter("experience"));
String sql="update employee set name=?,email=?,phone=?,date_of_birth=?,age=?,gender=?,designation=?,experience=? where eid=?";
ps=connection.prepareStatement(sql);
ps.setString(1,name);
ps.setString(2,email);
ps.setLong(3, phone);
ps.setString(4,date_of_birth);
ps.setInt(5,age);
ps.setString(6, gender);
ps.setString(7, designation);
ps.setInt(8,experience);
ps.setInt(9, eid);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("./Employee_Profile.jsp?msg=updated sucessfully");
else
	response.sendRedirect("./Employee_Profile_Update_Display.jsp?msg=update failed");
%>