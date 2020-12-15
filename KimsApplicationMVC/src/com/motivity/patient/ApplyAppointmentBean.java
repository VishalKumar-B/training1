package com.motivity.patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.databaseconnection.DatabaseConnection;

public class ApplyAppointmentBean {

	private int id;
	private String name;
	private String phone;
	private String email;
	private String gender;
	private String blood_group;
	private String specialist;
	private String date_of_appointment;
	private String time_of_appointment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getDate_of_appointment() {
		return date_of_appointment;
	}

	public void setDate_of_appointment(String date_of_appointment) {
		this.date_of_appointment = date_of_appointment;
	}

	public String getTime_of_appointment() {
		return time_of_appointment;
	}

	public void setTime_of_appointment(String time_of_appointment) {
		this.time_of_appointment = time_of_appointment;
	}

	public boolean applyAppointment() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();

		String sql = "insert into appointment (name,phone,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment,pid) values (?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, getName());
		ps.setString(2, getPhone());
		ps.setString(3, getEmail());
		ps.setString(4, getGender());
		ps.setString(5, getBlood_group());
		ps.setString(6, getSpecialist());
		ps.setString(7, getDate_of_appointment());
		ps.setString(8, getTime_of_appointment());
		ps.setInt(9, getId());
		
		int x = ps.executeUpdate();

		if (x != 0)
			return true;

		else
			return false;
	}

}
