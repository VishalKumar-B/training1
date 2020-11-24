package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AlterDrop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/motivity";
		String user = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection != null)
			System.out.println("connection established");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter table name that you want to alter: ");
		String tableName = sc.nextLine();

		System.out.println("enter the column that you want to drop: ");
		String columnName = sc.nextLine();

		String query = "alter table " + tableName + " drop column " + columnName + " ";
		System.out.println("SQL Query: " + query);
		Statement st = connection.createStatement();

		boolean x = st.execute(query);
		if (x != true)
			System.out.println("column dropped successfully");

		System.out.println(st.getUpdateCount());
		sc.close();

	}

}
