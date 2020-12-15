package com.motivity.patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class PatientProfileBean {

	private int id;
	private String name;
	private String email;
	private int age;
	private String phone;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public void patientProfile() throws ClassNotFoundException, SQLException {
		
		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "select * from patient where id=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, getId());
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {

			setName(rs.getString("name"));
			setEmail(rs.getString("email"));
			setAge(rs.getInt("age"));
			setPhone(rs.getString("phone"));
		}
	}
}
