package com.motivity.securityguard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateVisitorDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		VisitorsPOJO vp = new VisitorsPOJO();
		
		vp.setVisitor_name(request.getParameter("visitor_name"));
		vp.setVisitor_mobile(request.getParameter("visitor_mobile"));
		vp.setVisitor_aadhar_id(request.getParameter("visitor_aadhar_id"));
		vp.setVisitor_visit_flat(request.getParameter("visitor_visit_flat"));
		vp.setVisitor_visit_name(request.getParameter("visitor_visit_name"));
		vp.setVisitor_visit_time(request.getParameter("visitor_visit_time"));
		
		UpdateVisitorDetailsBean uvdb = new UpdateVisitorDetailsBean();
		Object a = uvdb.update(vp);
		

		if(a!=null) {
			System.out.println("updated successfully");
			response.sendRedirect("update_visitors_details.jsp?msg=updated successfully");
		}
		else
		{
			System.out.println("registeration failed");
			response.sendRedirect("update_visitors_details.jsp?msg=update failed");
		}
		
	}

}
