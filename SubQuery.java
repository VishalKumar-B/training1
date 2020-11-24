package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/motivity";
		String user = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection != null)
			System.out.println("connection established");

		Statement st = connection.createStatement();

		String query = "select * from customer where id not in(select customerId from orders)";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1)+ " Name: " + rs.getString(2));
		}
	}

}
