package com.motivity.doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class DoctorLoginBean {

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
	
	private int id;
	private String name;
	private String specialisation;
	
	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public boolean loginValidate(String email, String password) throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();

		String sql = "select * from doctor where email=? and password=?";

		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		
		
		if (rs.next()) {
			setId(rs.getInt("id"));
			setName(rs.getString("name"));
			setSpecialisation(rs.getString("specialisation"));
			return true;
		}
		else {
			return false;
		}
	}
}
