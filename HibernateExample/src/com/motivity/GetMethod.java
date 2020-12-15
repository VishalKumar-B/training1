package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetMethod {
	
	//get() is used the get the data form the database.

	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		StudentPOJO s = se.get(StudentPOJO.class, 101); 
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()); 
		
		Transaction tx = se.beginTransaction();
		tx.commit();
		
		se.close();
		sf.close();
	}

}
