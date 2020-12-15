package com.motivity.patient;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class PatientRegisterController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		String phone = request.getParameter("phone");

		PatientRegisterBean prb = new PatientRegisterBean();
		prb.setName(name);
		prb.setPassword(password);
		prb.setEmail(email);
		prb.setAge(age);
		prb.setPhone(phone);

		HttpSession hs = request.getSession();
		hs.setAttribute("patientloginbean", prb);

		boolean status = false;

		try {
			status = prb.patientRegister(name, password, email, age, phone);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		if(status) {
			response.sendRedirect("./Patient_Login.html?msg=registered successfully");
		}
		else {
			response.sendRedirect("./Patient_Register.html?msg=failed");
		}

	}

}
