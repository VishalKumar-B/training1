package com.motivity.patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.databaseconnection.DatabaseConnection;

public class PatientAppointmentStatusBean {

	private int pid;
	private String name;
	private int phone;
	private String email;
	private String gender;
	private String blood_group;
	private String specialist;
	private String date_of_appointment;
	private String time_of_appointment;
	private String status;
	private String doctor_name;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public ArrayList<PatientAppointmentStatusBean> patientAppointmentStatus()
			throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnection.connectivity();

		String sql = "select * from appointment where pid=?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, getPid());
		ResultSet rs = ps.executeQuery();

		ArrayList<PatientAppointmentStatusBean> al = new ArrayList<>();

		while (rs.next()) {
			PatientAppointmentStatusBean pasb1 = new PatientAppointmentStatusBean();

			pasb1.setName(rs.getString("name"));
			pasb1.setPhone(rs.getInt("phone"));
			pasb1.setEmail(rs.getString("email"));
			pasb1.setGender(rs.getString("gender"));
			pasb1.setBlood_group(rs.getString("blood_group"));
			pasb1.setSpecialist(rs.getString("specialist"));
			pasb1.setDate_of_appointment(rs.getString("date_of_appointment"));
			pasb1.setTime_of_appointment(rs.getString("time_of_appointment"));
			pasb1.setStatus(rs.getString("status"));
			pasb1.setDoctor_name(rs.getString("doctor_name"));

			al.add(pasb1);
		}
		return al;
	}
}
