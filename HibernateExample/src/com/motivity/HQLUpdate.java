package com.motivity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLUpdate {

	public static void main(String[] args) {
	
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		//updating one particular record
		
		/*
		 * Query qr = se.createQuery("update StudentPOJO s set s.marks = ?0 where s.id = ?1");
		 * qr.setParameter(0, 567); 
		 * qr.setParameter(1, 101); 
		 * int a = qr.executeUpdate();
		 */
		
		//updating multiple records
		
		Query qr = se.createQuery("update StudentPOJO s set s.marks = s.marks+?0 where s.id in (?1,?2)");
		qr.setParameter(0, 10);
		qr.setParameter(1, 107);
		qr.setParameter(2, 102);
		int a = qr.executeUpdate();
		
		tx.commit();
		if(a!=0)
			System.out.println("record updated");
		
		se.close();
		sf.close();
	}

}
