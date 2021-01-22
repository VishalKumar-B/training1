package com.motivity;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert {

	public static void main(String[] args) {
		
		Session se = DBConnection.con();
		Transaction tx = se.beginTransaction();
		
		Student s = new Student();
		s.setFirstname("jhon");
		s.setLastname("deer");
	
		
		se.save(s);
		tx.commit();
		
		
	}

}
