package com.motivity.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class ManagerLoginBean {

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
	
	private int mid;
	private String mname;
	
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}
	
	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}


	public boolean loginValidate(String email, String password) throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();

		String sql="select * from manager where email=? and password = ?";

		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		
		
		if (rs.next()) {
			setMid(rs.getInt("mid"));
			setMname(rs.getString("name"));
			return true;
		}
		else {
			return false;
		}
		
	}
}
