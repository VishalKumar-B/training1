package com.motivity.employee;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class EmployeeLoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		EmployeeLoginBean elb = new EmployeeLoginBean();
		elb.setEmail(email);
		elb.setPassword(password);

		HttpSession hs = request.getSession();
		hs.setAttribute("employeeloginbean", elb);

		boolean status = false;

		try {
			status = elb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		if(status) {
			hs.setAttribute("eid", elb.getEid());
			response.sendRedirect("./Employee_Home.html?msg=login sucessfully");
		}
		else {
			response.sendRedirect("./Employee_Login.html?msg=login failed");
		}

	}

}
