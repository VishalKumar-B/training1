package com.motivity.manager;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
public class ManagerLoginController extends HttpServlet {
	
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		ManagerLoginBean mlb = new ManagerLoginBean();
		mlb.setEmail(email);
		mlb.setPassword(password);

		HttpSession hs = request.getSession();
		hs.setAttribute("managerloginbean", mlb);

		boolean status = false;

		try {
			status = mlb.loginValidate(email, password);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		if(status) {
			hs.setAttribute("mid", mlb.getMid());
			hs.setAttribute("mname", mlb.getMname());
			response.sendRedirect("./Manager_Home.html?msg=login sucessfully");
		}
		else {
			response.sendRedirect("./Manager_Login.html?msg=login failed");
		}
	}

}
