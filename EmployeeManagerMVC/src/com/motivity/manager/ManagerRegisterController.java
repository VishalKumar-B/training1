package com.motivity.manager;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class ManagerRegisterController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String date_of_birth = request.getParameter("date_of_birth");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		int experience = Integer.parseInt(request.getParameter("experience"));
		
		ManagerRegisterBean mrb = new ManagerRegisterBean();
		
		mrb.setName(name);
		mrb.setPassword(password);
		mrb.setEmail(email);
		mrb.setPhone(phone);
		mrb.setDate_of_birth(date_of_birth);
		mrb.setAge(age);
		mrb.setGender(gender);
		mrb.setExperience(experience);
		
		boolean status = false;
		
		try {
			status = mrb.managerRegister(name, password, email, phone, date_of_birth, age, gender, experience);
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		if(status)
			response.sendRedirect("./Manager_Login.html?msg=registered sucessfully");
		
		else
			response.sendRedirect("./Manager_Register.html?msg=register failed");
	}

}
