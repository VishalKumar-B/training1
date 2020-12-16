package com.motivity.employee;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void deleteOperation() {
		String more = " ";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter 1.delete all records 2.delete one particular record");

			int option = sc.nextInt();
			Configuration cf = new Configuration();
			cf.configure("configuration.xml");
			SessionFactory sf = cf.buildSessionFactory();
			Session se = sf.openSession();
			if (option == 1) {
				Transaction tx = se.beginTransaction();
				Query qr = se.createQuery("delete from EmployeePOJO emp");
				int a = qr.executeUpdate();
				tx.commit();
				if (a == 0)
					System.out.println("all the records are deleted");
			}
			if (option == 2) {
				Transaction tx = se.beginTransaction();
				System.out.println("enter your id");
				Query qr = se.createQuery("delete from EmployeePOJO emp where emp.id=:id");
				qr.setParameter("id", sc.nextInt());
				int a = qr.executeUpdate();
				tx.commit();
				if (a == 1)
					System.out.println("record deleted");
			}

			System.out.println("Do you want to continue (y/n): ");
			more = sc.next();
		} while (more.equalsIgnoreCase("y"));

	}

}
