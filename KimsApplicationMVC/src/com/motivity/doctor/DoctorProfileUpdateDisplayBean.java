package com.motivity.doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class DoctorProfileUpdateDisplayBean {

	private int id;
	private String name;
	private String email;
	private int phone;
	private String specialisation;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public void doctorProfileUpdateDisplay() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		String sql = "select * from doctor where id=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, getId());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			setName(rs.getString("name"));
			setEmail(rs.getString("email"));
			setPhone(rs.getInt("phone"));
			setSpecialisation(rs.getString("specialisation"));
		}

	}
}
