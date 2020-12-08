package com.motivity.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class EmployeeProfileUpdateBean {

	private int eid;
	private String name;
	private String email;
	private long phone;
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
	
	public boolean employeeProfileUpdate() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		
		String sql="update employee set name=?,email=?,phone=?,date_of_birth=?,age=?,gender=?,designation=?,experience=? where eid=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setString(1, getName());
		ps.setString(2, getEmail());
		ps.setLong(3, getPhone());
		ps.setString(4, getDate_of_birth());
		ps.setInt(5, getAge());
		ps.setString(6, getGender());
		ps.setString(7, getDesignation());
		ps.setInt(8, getExperience());
		ps.setInt(9, getEid());
		
		int x = ps.executeUpdate();
		
		if (x != 0)
			return true;
		else
			return false;
	}
}
