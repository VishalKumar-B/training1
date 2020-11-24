package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OrderBy {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/motivity";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);
		if (connection != null)
			System.out.println("connection established");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the columnn name: ");
		String columnName = sc.nextLine();

		System.out.println("enter the asc or desc order: ");
		String order = sc.nextLine();

		Statement st = connection.createStatement();
		String query = " select * from student order by " + columnName + " " + order + " ";
		System.out.println(query);

		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Marks: " + rs.getInt(3)
					+ " Section: " + rs.getString(4));
		}
		sc.close();
	}

}
