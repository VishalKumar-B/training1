package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GroupBy {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/motivity";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);
		if (connection != null)
			System.out.println("connection established");

		Statement st = connection.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the column which you want to select using group by: ");
		String columnName = sc.nextLine();
		String query = "select max(marks) ,section from Student group by " + columnName + " ";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println("Max marks: " + rs.getInt(1) + " Section: " + rs.getString(2));
		}

		sc.close();
	}

}
