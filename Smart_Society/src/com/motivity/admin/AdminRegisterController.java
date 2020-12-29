package com.motivity.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		AdminPOJO ap = new AdminPOJO();
		ap.setAdmin_name(request.getParameter("admin_name"));
		ap.setAdmin_email(request.getParameter("admin_email"));
		ap.setAdmin_password(request.getParameter("admin_password"));

		AdminRegisterBean arb = new AdminRegisterBean();
		Object a = arb.register(ap);
		
		if(a!=null) {
			System.out.println("registered successfully");
			response.sendRedirect("admin_home.jsp?msg=registered successfully");
		}
		else
		{
			System.out.println("registeration failed");
			response.sendRedirect("admin_register.jsp?msg=registeration failed");
		}
	}

}
