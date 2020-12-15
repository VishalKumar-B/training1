package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadMethod {
	/*
		It  is also used to fetch data from the database for the given identifier 
		It will throw object not found exception 
		It always returns proxy object so this method is lazy load the object
		If you are sure that object exist then use load() method 
	*/
	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		StudentPOJO s = se.load(StudentPOJO.class, 101); 
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()); 
		
		Transaction tx = se.beginTransaction();
		tx.commit();
		
		se.close();
		sf.close();
	}

}
