package com.motivity.securityguard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.motivity.admin.AdminPOJO;
import com.motivity.admin.ChangePasswordBean;


public class SecurityGuardChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession hs = request.getSession();
		String password = (String) hs.getAttribute("securityguard_password");
		int securityguard_id = (Integer) hs.getAttribute("securityguard_id");
		
		String old_securityguard_password = request.getParameter("old_securityguard_password");
		String new_securityguard_password = request.getParameter("new_securityguard_password");
		String new_securityguard_password_confirm = request.getParameter("new_securityguard_password_confirm");

		boolean b = password.equals(old_securityguard_password) && new_securityguard_password.equals(new_securityguard_password_confirm);

		if (b == false) {
			System.out.println("in-valid credentials");
			response.sendRedirect("securityguard_change_password.jsp?password invalid");
			return;
		}

		SecurityGuardPOJO sp = new SecurityGuardPOJO();
		sp.setSecurityguard_password(new_securityguard_password);
		sp.setSecurityguard_id(securityguard_id);
		
		SecurityGuardChangePasswordBean scpb = new SecurityGuardChangePasswordBean();
		int a = scpb.update_password(sp);
		
		if(a>0) {
			System.out.println("updated");
			response.sendRedirect("securityguard_login.jsp?updated");
		}
		else {
			System.out.println("failed");
			response.sendRedirect("securityguard_change_password.jsp?password update failed");
		}

	
	}

}
