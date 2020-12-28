package com.motivity.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession hs = request.getSession();
		String password = (String) hs.getAttribute("admin_password");
		int admin_id = (Integer) hs.getAttribute("admin_id");
		String admin_email = (String) hs.getAttribute("admin_email");

		String old_password = request.getParameter("old_admin_password");
		String new_admin_password = request.getParameter("new_admin_password");
		String new_admin_password_confirm = request.getParameter("new_admin_password_confirm");

		boolean b = password.equals(old_password) && new_admin_password.equals(new_admin_password_confirm);

		if (b == false) {
			System.out.println("in-valid credentials");
			response.sendRedirect("change_password.jsp?password invalid");
			return;
		}

		AdminPOJO ap = new AdminPOJO();
		ap.setAdmin_password(new_admin_password);
		ap.setAdmin_id(admin_id);
		ap.setAdmin_email(admin_email);
		
		ChangePasswordBean cpb = new ChangePasswordBean();
		int a = cpb.update_password(ap);
		
		if(a>0) {
			System.out.println("updated");
			response.sendRedirect("admin_home.jsp?updated");
		}
		else {
			System.out.println("failed");
			response.sendRedirect("change_password.jsp?password update failed");
		}
	}

}
