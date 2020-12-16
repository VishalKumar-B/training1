package com.motivity.employee;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Display {

	public static void displayOperation() {

		Scanner sc = new Scanner(System.in);
		String more="";
		do {
		System.out.println("select any one option \n1.display all records\n2.display particular record");
		int option = sc.nextInt();
	

		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		if (option == 1) {
			Query qr = se.createQuery("from EmployeePOJO emp");
			List<EmployeePOJO> list = qr.list();
			Iterator it = list.iterator();
			
			while (it.hasNext()) {
				EmployeePOJO emp = (EmployeePOJO) it.next();
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail()+" "+emp.getPhone()+" "+
									emp.getDate_of_birth()+" "+emp.getAge()+" "+emp.getGender()+" "+
									emp.getDesignation()+" "+emp.getExperience());
			}
		}
		if (option == 2) {
			System.out.println("Enter id to show the employee details");
			Query qr = se.createQuery("from EmployeePOJO emp where id=:id");
			qr.setParameter("id", sc.nextInt());
			List<EmployeePOJO> list = qr.list();
			Iterator it = list.iterator();
			
			while (it.hasNext()) {
				EmployeePOJO emp = (EmployeePOJO) it.next();
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail()+" "+emp.getPhone()+" "+
						emp.getDate_of_birth()+" "+emp.getAge()+" "+emp.getGender()+" "+
						emp.getDesignation()+" "+emp.getExperience());
			}
		}
		System.out.println("Do you want to continue (y/n): ");
		more = sc.next();
	} while (more.equalsIgnoreCase("y"));
	
	}

}
