package com.motivity.patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class PatientProfileUpdateBean {

	int id;
	String name;
	String email;
	int age;
	long phone;

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public boolean patientProfileUpdateDisplay() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		
		String sql="Update patient set name=?,email=?,age=?,phone=? where id=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setString(1, getName());
		ps.setString(2, getEmail());
		ps.setInt(3, getAge());
		ps.setLong(4, getPhone());
		ps.setInt(5, getId());		
		
		int x = ps.executeUpdate();
		
		if (x != 0)
			return true;
		else
			return false;
	}
}
