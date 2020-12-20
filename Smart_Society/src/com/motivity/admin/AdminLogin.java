package com.motivity.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdminPOJO ap = new AdminPOJO();
		ap.setAdmin_id(1);
		ap.setAdmin_name("admin");
		ap.setAdmin_email("admin@gmail.com");
		ap.setAdmin_password("admin");
		
		String email=request.getParameter("admin_email");
		String password=request.getParameter("admin_password");
		
		if(email.equals(ap.getAdmin_email()) && password.equals(ap.getAdmin_password())) {
			System.out.println("login successful");
			response.sendRedirect("admin_home.jsp");
		}
		else {
			response.sendRedirect("admin_login.jsp?msg=loginfailed");
		}
	}

}
