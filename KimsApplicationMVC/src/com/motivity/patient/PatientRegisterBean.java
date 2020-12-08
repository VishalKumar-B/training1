package com.motivity.patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class PatientRegisterBean {

	private String name;
	private String password;
	private String email;
	private int age;
	private long phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean patientRegister(String name, String password, String email, int age, long phone)
			throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();

		String sql = "insert into patient (name, password, email, age, phone) values (?, ?, ?, ?, ?)";

		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setInt(4, age);
		ps.setLong(5, phone);

		int x = ps.executeUpdate();

		if (x != 0)
			return true;

		else
			return false;
		
	}
}
