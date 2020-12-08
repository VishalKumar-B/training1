package com.motivity.doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class DoctorProfileUpdateBean {

	private int id;
	private String name;
	private String email;
	private long phone;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public boolean doctorProfileUpdateDisplay() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "Update doctor set name=?,email=?,phone=?,specialisation=? where id=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setString(1, getName());
		ps.setString(2, getEmail());
		ps.setLong(3, getPhone());
		ps.setString(4, getSpecialisation());
		ps.setInt(5, getId());
		
		int x = ps.executeUpdate();
		
		if (x != 0)
			return true;
		else
			return false;
	}
}
