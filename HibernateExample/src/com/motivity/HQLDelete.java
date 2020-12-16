package com.motivity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLDelete {

	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		Query qr = se.createQuery("delete from StudentPOJO s where s.id = ?0");
		qr.setParameter(0, 107);
		int a = qr.executeUpdate();
		
		tx.commit();
		if(a!=0)
			System.out.println("record deleted");
		
		se.close();
		sf.close();
	}

}
