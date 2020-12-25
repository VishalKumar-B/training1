package com.motivity.owner;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OwnerProfileUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs = request.getSession();
	    String password = (String) hs.getAttribute("owner_password");
	    String password_given = request.getParameter("password");

	    boolean b = password.equals(password_given);
		
	    if(password_given==null || b==false) {
			System.out.println("enter valid password");
			response.sendRedirect("owner_profile_update.jsp?password invalid");
			return;
		}
	    
		OwnerPOJO op=new OwnerPOJO();
		op.setId(Integer.parseInt(request.getParameter("id")));
		op.setName(request.getParameter("name"));
		op.setEmailid(request.getParameter("email"));
		op.setMobilenumber(request.getParameter("mobilenumber"));
		op.setPassword(request.getParameter("password"));
		
			
		OwnerProfileUpdateBean opub = new OwnerProfileUpdateBean();
		int a = opub.update(op);
		if(a>0) {
			System.out.println("updated");
			response.sendRedirect("owner_profile.jsp?updated");
		}
		else {
			System.out.println("failed");
			response.sendRedirect("owner_profile_update.jsp?update failed");
		}
			
	}

}
