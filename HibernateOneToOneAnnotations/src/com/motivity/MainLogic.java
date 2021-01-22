package com.motivity;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {
		
		Session se = DBConnection.con();
		Transaction tx = se.beginTransaction();
		
		Student s = new Student();
		s.setFirstname("k");
		s.setLastname("j");
		
		ContactInformation c = new ContactInformation();
		c.setCity("hyd");
		c.setPhone(1234);
		
		/*
		 * ContactInformation c1 = new ContactInformation(); c1.setCity("tel");
		 * c.setPhone(2345);
		 */
		
		s.setContactinformation(c);
		//s.setContactinformation(c1);
		
		se.save(s);
		tx.commit();
	}

}
