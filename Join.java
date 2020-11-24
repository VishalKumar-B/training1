package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Join {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/motivity";
		String user = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection != null)
			System.out.println("connection established");

		Statement st = connection.createStatement();

		String query = "select c.id,c.name,o.id from customer c join orders o where c.id=o.id";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println(
					"CustomerId: " + rs.getInt(1) + " CustomerName: " + rs.getString(2) + " OrderId: " + rs.getInt(3));
		}
	}

}
