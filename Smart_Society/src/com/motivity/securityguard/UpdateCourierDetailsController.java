package com.motivity.securityguard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateCourierDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CourierPOJO cp = new CourierPOJO();
		
		cp.setCourier_flat_number(Integer.parseInt(request.getParameter("courier_flat_number")));
		cp.setCourier_receiver_name(request.getParameter("courier_receiver_name"));
		cp.setCourier_from_address(request.getParameter("courier_from_address"));
		cp.setCourier_received_date(request.getParameter("courier_received_date"));
		cp.setCourier_received_time(request.getParameter("courier_received_time"));
		
		UpdateCourierDetailsBean ucdb = new UpdateCourierDetailsBean();
		Object a = ucdb.update(cp);
		
		if(a!=null) {
			System.out.println("updated successfully");
			response.sendRedirect("update_courier_details.jsp?msg=updated successfully");
		}
		else
		{
			System.out.println("registeration failed");
			response.sendRedirect("update_courier_details.jsp?msg=update failed");
		}
	}

}
