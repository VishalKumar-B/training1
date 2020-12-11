package com.motivity.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class LeaveApplicationBean {

	private int eid;
	private String name;
	private String email;
	private String phone;
	private int leaves_remaining;


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

	public int getLeaves_remaining() {
		return leaves_remaining;
	}

	public void setLeaves_remaining(int leaves_remaining) {
		this.leaves_remaining = leaves_remaining;
	}

	public void leaveApplication() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		String sql = "select name, email, phone, leaves_remaining from employee where eid=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, getEid());
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {

			setName(rs.getString("name"));
			setEmail(rs.getString("email"));
			setPhone(rs.getString("phone"));
			setLeaves_remaining(rs.getInt("leaves_remaining"));
		}
	}

}
