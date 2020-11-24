package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/motivity";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);
		if (connection != null)
			System.out.println("connection established");

		Statement st = connection.createStatement();
		String query = "select sum(marks) ,avg(marks) ,min(marks) ,max(marks) ,count(*) from Student";

		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println(
					"Sum(marks): " + rs.getInt(1) + '\n' + "Avg(marks): " + rs.getInt(2) + '\n' + "min(marks): "
							+ rs.getInt(3) + '\n' + "max(marks): " + rs.getInt(4) + '\n' + "count: " + rs.getInt(5));
		}

	}

}
