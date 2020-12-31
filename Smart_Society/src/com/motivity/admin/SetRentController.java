package com.motivity.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetRentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	RentPOJO rp = new RentPOJO();
	rp.setFlat_type(request.getParameter("flat_type"));
	rp.setRent(request.getParameter("rent"));
	
	SetRentBean srb = new SetRentBean();
	Object a = srb.set(rp);
	
	if(a!=null) {
		System.out.println("rent set successfully");
		response.sendRedirect("view_rent.jsp?msg=successful");
	}
	else
	{
		System.out.println("failed");
		response.sendRedirect("set_rent.jsp?msg=failed");
	}

	}

}
