package com.motivity.doctor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DoctorRegisterController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phone"));
		String specialisation = request.getParameter("specialization");
		
		DoctorRegisterBean drb = new DoctorRegisterBean();
		drb.setName(name);
		drb.setPassword(password);
		drb.setEmail(email);
		drb.setPhone(phone);
		drb.setSpecialisation(specialisation);
		
		
		boolean status = false;
		
		try {
			status = drb.doctorRegister(name, password, email, phone, specialisation);
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		if(status) {
			response.sendRedirect("./Doctor_Login.html?msg=registered successfully");
		}
		else {
			response.sendRedirect("./Doctor_Register.html?msg=failed");
		}
			
		
		
	}

}
