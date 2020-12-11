package com.motivity.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class ApplyLeaveBean {
	private int eid;
	private String name;
	private String email;
	private String phone;
	private int no_of_days;
	private String from_date;
	private String to_date;
	private String manager_name;

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

	public int getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	
	
	public boolean applyLeave() throws ClassNotFoundException, SQLException {
		
		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "insert into leaves(name,email,phone,no_of_days,from_Date,to_date,eid,manager_name) values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, getName());
		ps.setString(2, getEmail());
		ps.setString(3, getPhone());
		ps.setInt(4, getNo_of_days());
		ps.setString(5, getFrom_date());
		ps.setString(6, getTo_date());
		ps.setInt(7, getEid());
		ps.setString(8, getManager_name());
		int x = ps.executeUpdate();

		if (x != 0)
			return true;

		else
			return false;
	}
}
