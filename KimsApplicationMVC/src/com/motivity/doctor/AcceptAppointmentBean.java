package com.motivity.doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class AcceptAppointmentBean {

	private int aid;
	private String doctor_name;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public boolean acceptAppointment() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();

		String sql = "update appointment set status=?,doctor_name=? where aid=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, "Accepted");
		ps.setString(2, getDoctor_name());
		ps.setInt(3, getAid());
		int x = ps.executeUpdate();

		if (x != 0)
			return true;
		else
			return false;
	}
}
