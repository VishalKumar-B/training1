package com.manager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.databaseconnection.DatabaseConnection;

public class ManagerRegisteration extends HttpServlet {
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phone"));
		String date_of_birth = request.getParameter("date_of_birth");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		int experience = Integer.parseInt(request.getParameter("experience"));

		String sql = "insert into manager(name,password,email,phone,date_of_birth,age,gender,experience) values(?,?,?,?,?,?,?,?)";
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setString(5, date_of_birth);
			ps.setInt(6, age);
			ps.setString(7, gender);
			ps.setInt(8, experience);
			int x = ps.executeUpdate();
			if (x != 0)
				response.sendRedirect("./Manager_Login.html?msg=registered sucessfully");
			else
				response.sendRedirect("./Manager_Register.html?msg=register failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}