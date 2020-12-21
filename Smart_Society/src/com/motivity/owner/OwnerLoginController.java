package com.motivity.owner;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.motivity.securityguard.SecurityGuardLoginBean;
import com.motivity.securityguard.SecurityGuardPOJO;

public class OwnerLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		OwnerPOJO op = new OwnerPOJO();
		HttpSession hs = request.getSession();
		
		op.setEmailid(request.getParameter("email"));
		op.setPassword(request.getParameter("password"));
		
		OwnerLoginBean olb = new OwnerLoginBean();
		int a = olb.owner_Login(op);
		
		
		if(a>0) {
			System.out.println("login successfull");
			hs.setAttribute("owner_id", op.getId());
			hs.setAttribute("owner_flatnumber", op.getFlatnumber());
			response.sendRedirect("owner_home.jsp?msg=login successful");
		}
		else
		{
			System.out.println("login failed");
			response.sendRedirect("owner_login.jsp?msg=login failed");
		}
	}

}
