package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/motivity";
		String user = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection != null)
			System.out.println("connection established");

		Statement st = connection.createStatement();
		String query = "create table teacher (id int(10) Primary key, name varchar(25), designation varchar(25), salary int(20))";
		boolean x = st.execute(query);
		if(x != true)
			System.out.println("table created successfully");
		
		System.out.println(st.getUpdateCount());
				
	}

}
