package com.motivity.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs = request.getSession();
		
		AdminPOJO ap = new AdminPOJO();
		ap.setAdmin_email(request.getParameter("admin_email"));
		ap.setAdmin_password(request.getParameter("admin_password"));
		
		AdminLoginBean alb = new AdminLoginBean();
		int a = alb.admin_Login(ap);
		
		if(a>0) {
			System.out.println("login successful");
			hs.setAttribute("admin_id", ap.getAdmin_id());
			hs.setAttribute("admin_email", ap.getAdmin_email());
			hs.setAttribute("admin_password", ap.getAdmin_password());
			response.sendRedirect("admin_home.jsp");
		}
		else {
			response.sendRedirect("admin_login.jsp?msg=loginfailed");
		}
	}

}
