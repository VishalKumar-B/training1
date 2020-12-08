package com.motivity.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.databaseconnection.DatabaseConnection;

public class ViewLeavesBean {
	
	private int eid;
	private int lid;
	private String name;
	private String email;
	private long phone;
	private int no_of_days;
	private String from_date;
	private String to_date;
	private String status;
	private String manager_name;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
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
	
	public ArrayList<ViewLeavesBean> viewLeaves() throws ClassNotFoundException, SQLException {
		
		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "select * from leaves where manager_name=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, manager_name);
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ViewLeavesBean> al = new ArrayList<>();
		
		while (rs.next()) { 
			
			ViewLeavesBean vlb1 = new ViewLeavesBean();
			vlb1.setName(rs.getString("name"));
			vlb1.setEmail(rs.getString("email"));
			vlb1.setPhone(rs.getInt("phone"));
			vlb1.setNo_of_days(rs.getInt("no_of_days"));
			vlb1.setFrom_date(rs.getString("from_date"));
			vlb1.setTo_date(rs.getString("to_date"));
			vlb1.setStatus(rs.getString("status"));
			vlb1.setEid(rs.getInt("eid"));
			vlb1.setLid(rs.getInt("lid"));
			
			al.add(vlb1);
		}
		return al;
	}
}
