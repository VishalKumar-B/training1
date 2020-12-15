package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveMethod {

	//save() is used to store the data given in object to database.
	
	public static void main(String args[]) {
		
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		StudentPOJO s = new StudentPOJO();
		s.setId(104);
		s.setName("madhu");
		s.setMarks(903);
		
		se.save(s); 
		
		Transaction tx = se.beginTransaction();
		tx.commit();
		
		se.close();
		sf.close();
	}
}
