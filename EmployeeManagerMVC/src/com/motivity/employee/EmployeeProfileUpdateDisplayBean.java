package com.motivity.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class EmployeeProfileUpdateDisplayBean {

	private int eid;
	private String name;
	private String email;
	private String phone;
	private String date_of_birth;
	private int age;
	private String gender;
	private String designation;
	private int experience;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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
	
	public void employeeProfileUpdateDisplay() throws ClassNotFoundException, SQLException {
		
		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "select * from employee where eid=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, getEid());
		
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) { 
			
			setEid(rs.getInt("eid"));
			setName(rs.getString("name"));
			setEmail(rs.getString("email"));
			setPhone(rs.getString("phone"));
			setDate_of_birth(rs.getString("date_of_birth"));
			setAge(rs.getInt("age"));
			setGender(rs.getString("gender"));
			setDesignation(rs.getString("designation"));
			setExperience(rs.getInt("experience"));	
			
		}
	}
}
