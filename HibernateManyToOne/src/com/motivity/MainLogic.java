package com.motivity;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {
	
		Config cf = new Config();
		Session se = cf.con();
		Transaction tx = se.beginTransaction();

		University1POJO u = new University1POJO();
		u.setUniversity_id(101);
		u.setUniversity_name("JNTU");
		u.setUniversity_place("Hyderabad");
		
		Student1POJO s1 = new Student1POJO();				
		s1.setStudent_id(1);		
		s1.setStudent_name("raju");
		s1.setFuid(u);
		
		Student1POJO s2 = new Student1POJO();
		s2.setStudent_id(2);
		s2.setStudent_name("kiran");
		s2.setFuid(u);
		
		se.save(s1);
		se.save(s2);
		
		tx.commit();
	}

}
