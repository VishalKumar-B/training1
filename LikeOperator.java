package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LikeOperator {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/motivity";
		String user = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection != null)
			System.out.println("connection established");

		Statement st = connection.createStatement();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name contains like: ");
		String sname = sc.nextLine();
		String query = "Select * from student where name like '" + sname + "'";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Marks: " + rs.getInt(3)
			+ " Section: " + rs.getString(4));
		}

		sc.close();
	}

}
