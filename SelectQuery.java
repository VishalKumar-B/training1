package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectQuery {

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
		System.out.println("enter student id to get the details: ");
		int sid = sc.nextInt();
		String query = "Select * from student where id='" + sid + "'";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1) + '\n' + "Name: " + rs.getString(2) + '\n' + "Marks: "
					+ rs.getInt(3) + '\n' + "Section: " + rs.getString(4));
		}

		sc.close();
	}

}
