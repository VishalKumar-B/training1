package com.motivity.employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void updateOperation() {

		Scanner sc = new Scanner(System.in);
		String more = "";
		do {
			System.out.println("select any one option: \n 1.update email \n 2.update phone");
			int option = sc.nextInt();
			int a;
			Configuration cf = new Configuration();
			cf.configure("configuration.xml");
			SessionFactory sf = cf.buildSessionFactory();
			Session se = sf.openSession();
			Transaction tx = se.beginTransaction();

			if (option == 1) {
				
				Query qr = se.createQuery("update EmployeePOJO emp set emp.email=?0 where emp.id=?1");
				System.out.println("enter new email id:");
				qr.setParameter(0, sc.next());
				System.out.println("enter the employee id to update: ");
				qr.setParameter(1, sc.nextInt());
				a = qr.executeUpdate();
				
				if (a == 1)
					System.out.println("email updated");
			
			}
			
			if (option == 2) {
				
				Query qr = se.createQuery("update EmployeePOJO emp set emp.phone=?0 where emp.id=?1");
				System.out.println("enter new mobile number:");
				qr.setParameter(0, sc.next());
				System.out.println("enter the employee id to update: ");
				qr.setParameter(1, sc.nextInt());
				a = qr.executeUpdate();
				
				if (a == 1)
					System.out.println("mobile number updated");
			}
			
			tx.commit();
			System.out.println("Do you want to continue (y/n)");
			more = sc.next();
			
		} while (more.equalsIgnoreCase("y"));
	}

}
