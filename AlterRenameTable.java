package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AlterRenameTable {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/motivity";
		String user = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection != null)
			System.out.println("connection established");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter table name that you want to rename: ");
		String oldTableName = sc.nextLine();

		System.out.println("enter the new table name: ");
		String newTableName = sc.nextLine();

		String query = "alter table " + oldTableName + " rename " + newTableName + " ";
		System.out.println("SQL Query: " + query);
		Statement st = connection.createStatement();

		boolean x = st.execute(query);
		if (x != true)
			System.out.println("table renamed successfully");

		System.out.println(st.getUpdateCount());
		sc.close();

	}
	
}
