package com.motivity.employee;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class EmployeeRegisterController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String date_of_birth = request.getParameter("date_of_birth");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String designation = request.getParameter("designation");
		int experience = Integer.parseInt(request.getParameter("experience"));

		EmployeeRegisterBean erb = new EmployeeRegisterBean();

		erb.setName(name);
		erb.setPassword(password);
		erb.setEmail(email);
		erb.setPhone(phone);
		erb.setDate_of_birth(date_of_birth);
		erb.setAge(age);
		erb.setGender(gender);
		erb.setDesignation(designation);
		erb.setExperience(experience);

		boolean status = false;

		try {
			status = erb.employeeRegister(name, password, email, phone, date_of_birth, age, gender, designation,
					experience);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		if (status) {
			response.sendRedirect("./Employee_Login.html?msg=registered sucessfully");
		} else {
			response.sendRedirect("./Employee_Register.html?msg=register failed");
		}
	}

}
