package com.motivity.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class RejectLeaveBean {

	private int lid;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public boolean rejectLeave() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();

		String sql = "update leaves set status=? where lid=?";

		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, "Rejected");
		ps.setInt(2, lid);
		int x = ps.executeUpdate();

		if (x != 0)
			return true;
		else
			return false;
	}
}
