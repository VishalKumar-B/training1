package com.employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.databaseconnection.DatabaseConnection;

public class EmployeeLogin extends HttpServlet {
	Connection connection = null;
	PreparedStatement ps = null;

	public void init(ServletConfig config) {
		try {
			connection = DatabaseConnection.connectivity();
		} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String sql="select * from employee where email=? and password = ?";
		try {
			ps=connection.prepareStatement(sql);
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			HttpSession hs=request.getSession();
			if(rs.next()) {
				hs.setAttribute("eid", rs.getInt("eid"));
				response.sendRedirect("./Employee_Home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./Employee_Login.html?msg=login failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
