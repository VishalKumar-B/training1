package com.motivity;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLInsert {

	public static void main(String args[])	{
		
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		StudentPOJO s = new StudentPOJO();
		s.setId(107);
		s.setName("sudheer");
		s.setMarks(707);
		
		Serializable sz = se.save(s);
		tx.commit();
		if(sz.hashCode()>0) {
			System.out.println("record inserted");
		}
		
		se.close();
		sf.close();
	}
}
