package com.motivity.patient;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class PatientLoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		PatientLoginBean plb = new PatientLoginBean();
		plb.setEmail(email);
		plb.setPassword(password);
		HttpSession hs = request.getSession();
		
		boolean status = false;
		
		try {
			status=plb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		if(status) {
			hs.setAttribute("sid", plb.getId());
			hs.setAttribute("spname", plb.getName());
			response.sendRedirect("./Patient_Home.html?msg=loggedin");
		}
		else {
			response.sendRedirect("./Patient_Login.html?msg=failed");
		}
		
	}

}
