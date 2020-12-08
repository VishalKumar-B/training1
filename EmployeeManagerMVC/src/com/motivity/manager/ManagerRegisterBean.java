package com.motivity.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class ManagerRegisterBean {

	private String name;
	private String password;
	private String email;
	private long phone;
	private String date_of_birth;
	private int age;
	private String gender;
	private int experience;

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public boolean managerRegister(String name, String password, String email, long phone, String date_of_birth,
			int age, String gender, int experience) throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "insert into manager(name,password,email,phone,date_of_birth,age,gender,experience) values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setLong(4, phone);
		ps.setString(5, date_of_birth);
		ps.setInt(6, age);
		ps.setString(7, gender);
		ps.setInt(8, experience);
		
		int x = ps.executeUpdate();
		
		if(x!=0) 
			return true;
		
		else
			return false;
	}
}
