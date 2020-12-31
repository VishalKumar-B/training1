package com.motivity.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.motivity.owner.OwnerProfileUpdateBean;
import com.motivity.securityguard.SecurityGuardPOJO;

public class SecurityGuardProfileUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SecurityGuardPOJO sgp = new SecurityGuardPOJO();
		sgp.setSecurityguard_id(Integer.parseInt(request.getParameter("securityguard_id")));
		sgp.setSecurityguard_name(request.getParameter("securityguard_name"));
		sgp.setSecurityguard_experience(Integer.parseInt(request.getParameter("securityguard_experience")));
		sgp.setSecurityguard_phone(request.getParameter("securityguard_phone"));
		sgp.setSecurityguard_address(request.getParameter("securityguard_address"));
		
		SecurityGuardProfileUpdateBean sgpu = new SecurityGuardProfileUpdateBean();
		int a = sgpu.update(sgp);
		if(a>0) {
			System.out.println("updated");
			response.sendRedirect("view_securityguard.jsp?updated");
		}
		else {
			System.out.println("failed");
			response.sendRedirect("securityguard_profile_update.jsp?update failed");
		}

	}

}
