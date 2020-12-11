package com.motivity.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class EmployeeRegisterBean {

	private String name;
	private String password;
	private String email;
	private String phone;
	private String date_of_birth;
	private int age;
	private String gender;
	private String designation;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public boolean employeeRegister(String name, String password, String email, String phone, String date_of_birth,
			int age, String gender, String designation, int experience) throws SQLException, ClassNotFoundException {

		Connection connection = DatabaseConnection.connectivity();

		String sql = "insert into employee(name,password,email,phone,date_of_birth,age,gender,designation,experience) values(?,?,?,?,?,?,?,?,?)";

		PreparedStatement ps = connection.prepareStatement(sql);

		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setString(4, phone);
		ps.setString(5, date_of_birth);
		ps.setInt(6, age);
		ps.setString(7, gender);
		ps.setString(8, designation);
		ps.setInt(9, experience);

		int x = ps.executeUpdate();

		if (x != 0)
			return true;

		else
			return false;
	}

}
