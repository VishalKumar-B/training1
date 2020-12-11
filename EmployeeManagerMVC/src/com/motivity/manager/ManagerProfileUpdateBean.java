package com.motivity.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class ManagerProfileUpdateBean {

	private int mid;
	private String name;
	private String email;
	private String phone;
	private String date_of_birth;
	private int age;
	private String gender;
	private int experience;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public boolean managerProfileUpdate() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "update manager set name=?,email=?,phone=?,date_of_birth=?,age=?,gender=?,experience=? where mid=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setString(1, getName());
		ps.setString(2, getEmail());
		ps.setString(3, getPhone());
		ps.setString(4, getDate_of_birth());
		ps.setInt(5, getAge());
		ps.setString(6, getGender());
		ps.setInt(7, getExperience());
		ps.setInt(8, getMid());
		
		int x = ps.executeUpdate();
		
		if (x != 0)
			return true;
		else
			return false;
	}
}
