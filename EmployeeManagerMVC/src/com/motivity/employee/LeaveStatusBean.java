package com.motivity.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.databaseconnection.DatabaseConnection;

public class LeaveStatusBean {

	private int eid;
	private String name;
	private String email;
	private String phone;
	private int no_of_days;
	private String from_date;
	private String to_date;
	private String status;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public ArrayList<LeaveStatusBean> leaveStatus()
			throws ClassNotFoundException, SQLException { 
		
		Connection connection = DatabaseConnection.connectivity();

		String sql = "select * from leaves where eid=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, getEid());
		ResultSet rs = ps.executeQuery();

		ArrayList<LeaveStatusBean> al = new ArrayList<>();
		
		while (rs.next()) { 
			
			LeaveStatusBean lsb1 = new LeaveStatusBean();
			
			lsb1.setName(rs.getString("name"));
			lsb1.setEmail(rs.getString("email"));
			lsb1.setPhone(rs.getString("phone"));
			lsb1.setNo_of_days(rs.getInt("no_of_days"));
			lsb1.setFrom_date(rs.getString("from_date"));
			lsb1.setTo_date(rs.getString("to_date"));
			lsb1.setStatus(rs.getString("status"));
			
			al.add(lsb1);
		}
		return al;
	}
}
