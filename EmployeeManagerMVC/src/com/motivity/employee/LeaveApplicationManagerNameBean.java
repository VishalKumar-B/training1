package com.motivity.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.databaseconnection.DatabaseConnection;

public class LeaveApplicationManagerNameBean {

	private String manager_name;

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	
	public ArrayList<LeaveApplicationManagerNameBean> managerNameDisplay() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();
		String query = "select name from manager";
		PreparedStatement ps1 = connection.prepareStatement(query);
		ResultSet rs1 = ps1.executeQuery();
		ArrayList<LeaveApplicationManagerNameBean> al = new ArrayList<>();
		while (rs1.next()) {
			LeaveApplicationManagerNameBean lamb1 = new LeaveApplicationManagerNameBean();
			lamb1.setManager_name(rs1.getString("name"));

			al.add(lamb1);
		}
		return al;
	}
}
