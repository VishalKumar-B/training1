package com.motivity.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class AcceptLeaveBean {

	private int eid;
	private int no_of_days;

	public int getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public boolean acceptLeave() throws ClassNotFoundException, SQLException {
		
		Connection connection = DatabaseConnection.connectivity();
		
		String sql = "update leaves set status=? where eid=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, "Accepted");
		ps.setInt(2, getEid());
		int x = ps.executeUpdate();

		if (x != 0)	{
			
			PreparedStatement ps1 = connection.prepareStatement("update employee set leaves_remaining=leaves_remaining-? where eid=?");
			ps1.setInt(1, getNo_of_days());
			ps1.setInt(2, getEid());
			int a = ps.executeUpdate();
			
			if(a!=0) 
				System.out.println("leaves updated");
			
			return true;
		}
		else
			return false;
	}
}
