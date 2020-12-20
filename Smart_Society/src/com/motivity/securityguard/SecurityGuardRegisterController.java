package com.motivity.securityguard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecurityGuardRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SecurityGuardPOJO sgp=new SecurityGuardPOJO();
		
		sgp.setSecurityguard_name(request.getParameter("securityguard_name"));
		sgp.setSecurityguard_email(request.getParameter("securityguard_email"));
		sgp.setSecurityguard_password(request.getParameter("securityguard_password"));
		sgp.setSecurityguard_phone(request.getParameter("securityguard_phone"));
		sgp.setSecurityguard_education(request.getParameter("securityguard_education"));
		sgp.setSecurityguard_aadhar(request.getParameter("securityguard_aadhar"));
		sgp.setSecurityguard_experience(Integer.parseInt(request.getParameter("securityguard_experience")));
		sgp.setSecurityguard_address(request.getParameter("securityguard_address"));
				
		SecurityGuardRegisterBean sgrb = new SecurityGuardRegisterBean();
		Object a = sgrb.register(sgp);
		
		if(a!=null) {
			System.out.println("registered successfully");
			response.sendRedirect("securityguard_register.jsp?msg=registered successfully");
		}
		else
		{
			System.out.println("registeration failed");
			response.sendRedirect("securityguard_register.jsp?msg=registeration failed");
		}
		
	}

}
