package com.motivity.doctor;

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

public class DoctorLogin extends HttpServlet {

	Connection connection = null;
	PreparedStatement ps = null;

	public void init(ServletConfig config) {
		try {
			connection = DatabaseConnection.connectivity();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		

		String sql = "select * from doctor where email=? and password=?";

		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);

			HttpSession hs = request.getSession();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				hs.setAttribute("sid", rs.getInt("id"));
				hs.setAttribute("sspecialisation", rs.getString("specialisation"));
				hs.setAttribute("sname", rs.getString("name"));
				response.sendRedirect("./Doctor_Home.html?msg=loggedin");
			} else {
				response.sendRedirect("./Doctor_Login.html?msg=failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}