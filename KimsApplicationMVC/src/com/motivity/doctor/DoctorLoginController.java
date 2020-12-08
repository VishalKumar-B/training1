package com.motivity.doctor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class DoctorLoginController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		DoctorLoginBean dlb = new DoctorLoginBean();
		dlb.setEmail(email);
		dlb.setPassword(password);
		HttpSession hs = request.getSession();
		hs.setAttribute("doctorloginbean", dlb);
		
		boolean status = false;
		
		try {

			status = dlb.loginValidate(email, password);
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		if(status) {
			hs.setAttribute("sid", dlb.getId());
			hs.setAttribute("sname", dlb.getName());
			hs.setAttribute("sspecialisation", dlb.getSpecialisation());
			response.sendRedirect("./Doctor_Home.html?msg=loggedin");
		}
		else {
			response.sendRedirect("./Doctor_Login.html?msg=failed");
		}
	}

}
