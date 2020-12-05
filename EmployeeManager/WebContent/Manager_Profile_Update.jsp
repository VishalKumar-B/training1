<%@include file="connection.jsp"%>
<%
	int mid = (Integer) session.getAttribute("mid");
String name = request.getParameter("name");
String email = request.getParameter("email");
long phone = Long.parseLong(request.getParameter("phone"));
String date_of_birth = request.getParameter("date_of_birth");
int age = Integer.parseInt(request.getParameter("age"));
String gender = request.getParameter("gender");
int experience = Integer.parseInt(request.getParameter("experience"));
String sql = "update manager set name=?,email=?,phone=?,date_of_birth=?,age=?,gender=?,experience=? where mid=?";
ps = connection.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, email);
ps.setLong(3, phone);
ps.setString(4, date_of_birth);
ps.setInt(5, age);
ps.setString(6, gender);
ps.setInt(7, experience);
ps.setInt(8, mid);
int x = ps.executeUpdate();
if (x != 0)
	response.sendRedirect("./Manager_Profile.jsp?msg=updated sucessfully");
else
	response.sendRedirect("./Manager_Profile_Update_Display.jsp?msg=update failed");
%>