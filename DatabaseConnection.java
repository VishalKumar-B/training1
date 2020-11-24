package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/motivity";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);
		if (connection != null)
			System.out.println("connection established");

		Statement statement = connection.createStatement();
		int x = statement.executeUpdate("insert into student values(101,'balu',357,'A')");
		if (x != 0)
			System.out.println("record inserted");

	}

}
