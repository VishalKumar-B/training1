package com.motivity.employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void insertOperation() {

		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println(
			"Enter employee details:\nid,name,email,phone,date_of_birth,age,gender,designation,experience");

			Configuration cf = new Configuration();
			cf.configure("configuration.xml");
			SessionFactory sf = cf.buildSessionFactory();
			Session se = sf.openSession();
			EmployeePOJO emp = new EmployeePOJO();
			Transaction tx = se.beginTransaction();

			emp.setId(sc.nextInt());
			emp.setName(sc.next());
			emp.setEmail(sc.next());
			emp.setPhone(sc.next());
			emp.setDate_of_birth(sc.next());
			emp.setAge(sc.nextInt());
			emp.setGender(sc.next());
			emp.setDesignation(sc.next());
			emp.setExperience(sc.nextInt());

			int i =(Integer)se.save(emp);
			tx.commit();
			
			if(i>0)
				System.out.println("record inserted");
			
			System.out.println("Do you want to continue (y/n)");
			choice = sc.next();
		} while (choice.equals("y"));

	}

}
