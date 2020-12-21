package com.motivity.owner;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OwnerRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		OwnerPOJO op=new OwnerPOJO();
		op.setAdharnumber(request.getParameter("adhar"));
		op.setDateofjoing(request.getParameter("date_of_joining"));
		op.setEmailid(request.getParameter("email"));
		op.setFlatnumber(Integer.parseInt(request.getParameter("flatnumber")));
		op.setFlattype(request.getParameter("type"));
		op.setFloornumber(Integer.parseInt(request.getParameter("FLOORNUMBER")));
		op.setGender(request.getParameter("gender"));
		op.setName(request.getParameter("name"));
		op.setMobilenumber(request.getParameter("mobilenumber"));
		op.setPassword(request.getParameter("password"));
		
		OwnerRegisterBean orb=new OwnerRegisterBean();
		Object a=orb.register(op);
		
		if(a!=null) {
			System.out.println("registered successfully");
			response.sendRedirect("owner_login.jsp?msg=registered successfully");
		}
		else
		{
			System.out.println("registeration failed");
			response.sendRedirect("owner_register.jsp?msg=registeration failed");
		}
	}

}
