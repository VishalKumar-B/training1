package com.motivity.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class EmployeeLoginBean {

	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private int eid;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public boolean loginValidate(String email, String password) throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();

		String sql="select * from employee where email=? and password = ?";

		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		
		
		if (rs.next()) {
			setEid(rs.getInt("eid"));
			return true;
		}
		else {
			return false;
		}
	}
}
