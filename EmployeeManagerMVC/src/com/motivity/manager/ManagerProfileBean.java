package com.motivity.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class ManagerProfileBean {

	private int mid;
	private String name;
	private String email;
	private long phone;
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

	public void managerProfile() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "select * from manager where mid=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, getMid());
		
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			setMid(rs.getInt("mid"));
			setName(rs.getString("name"));
			setEmail(rs.getString("email"));
			setPhone(rs.getInt("phone"));
			setDate_of_birth(rs.getString("date_of_birth"));
			setAge(rs.getInt("age"));
			setGender(rs.getString("gender"));
			setExperience(rs.getInt("experience"));
		}

	}
}
