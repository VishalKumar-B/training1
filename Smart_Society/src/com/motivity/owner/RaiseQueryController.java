package com.motivity.owner;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RaiseQueryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	QueryPOJO qp = new QueryPOJO();
	qp.setOwner_id(Integer.parseInt(request.getParameter("owner_id")));
	qp.setOwner_name(request.getParameter("owner_name"));
	qp.setOwner_email(request.getParameter("owner_email"));
	qp.setOwner_flat_number(request.getParameter("owner_flat_number"));
	qp.setComplaint(request.getParameter("query"));
	
	RaiseQueryBean rqb = new RaiseQueryBean();
	Object a = rqb.raiseQuery(qp);
	
	if(a!=null) {
		System.out.println("query raised successfully");
		response.sendRedirect("owner_home.jsp?msg=query raised successfully");
	}
	else
	{
		System.out.println("failed");
		response.sendRedirect("raise_query.jsp?msg=failed");
	}
	
	}

}
