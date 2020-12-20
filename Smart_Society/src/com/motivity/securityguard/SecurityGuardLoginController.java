package com.motivity.securityguard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecurityGuardLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SecurityGuardPOJO sgp = new SecurityGuardPOJO();
		HttpSession hs = request.getSession();
		
		sgp.setSecurityguard_email(request.getParameter("securityguard_email"));
		sgp.setSecurityguard_password(request.getParameter("securityguard_password"));
		
		SecurityGuardLoginBean sglb = new SecurityGuardLoginBean();
		int a = sglb.securityguard_Login(sgp);
		
		
		if(a>0) {
			System.out.println("login successfull");
			hs.setAttribute("securityguard_id", sgp.getSecurityguard_id());
			response.sendRedirect("securityguard_home.jsp?msg=login successfull");
		}
		else
		{
			System.out.println("login failed");
			response.sendRedirect("securityguard_login.jsp?msg=login failed");
		}
	}

}
