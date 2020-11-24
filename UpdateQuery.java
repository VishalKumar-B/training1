package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/motivity";
		String user = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection != null)
			System.out.println("connection established");

		PreparedStatement ps = connection.prepareStatement("update student set marks = ? where id = ?");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id which you want to update: ");
		ps.setInt(2, sc.nextInt());

		System.out.println("enter the updated marks: ");
		ps.setInt(1, sc.nextInt());

		int x = ps.executeUpdate();
		if (x != 0)
			System.out.println("marks updated successfully");

		sc.close();
	}

}
