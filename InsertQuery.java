package com.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/motivity";
		String user = "root";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		if(connection != null);
			System.out.println("connection established");
			
		PreparedStatement preparedstatement = connection.prepareStatement("insert into student values(?,?,?,?)");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id: ");
		preparedstatement.setInt(1, sc.nextInt());
		
		System.out.println("enter student name: ");
		preparedstatement.setString(2, sc.next());
		
		System.out.println("enter student marks: ");
		preparedstatement.setInt(3, sc.nextInt());
		
		System.out.println("enter student section: ");
		preparedstatement.setString(4, sc.next());
		
		int x = preparedstatement.executeUpdate();
		if(x != 0)
			System.out.println("record inserted");
		
		sc.close();
	}

}
