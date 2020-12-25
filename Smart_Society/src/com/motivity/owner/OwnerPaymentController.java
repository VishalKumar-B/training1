package com.motivity.owner;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OwnerPaymentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PaymentPOJO pp = new PaymentPOJO();
		
		pp.setOwner_id(Integer.parseInt(request.getParameter("owner_id")));
		pp.setOwner_name(request.getParameter("owner_name"));
		pp.setEmail_id(request.getParameter("email_id"));
		pp.setFlat_number(Integer.parseInt(request.getParameter("flat_number")));
		pp.setAmount(request.getParameter("amount"));
		pp.setCard_type(request.getParameter("card_type"));
		pp.setCard_number(request.getParameter("card_number"));
		pp.setDate(request.getParameter("date"));
		
		OwnerPaymentBean opb = new OwnerPaymentBean();
		Object a = opb.pay(pp);
		
		if(a!=null) {
			System.out.println("payment successful");
			response.sendRedirect("payment.jsp?msg=payment successful");
		}
		else
		{
			System.out.println("payment failed");
			response.sendRedirect("payment.jsp?msg=payment failed");
		}
		
	}

}
