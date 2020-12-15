package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MergeMethod {
	/*
	 * merge() can be used to update existing values,however this method
	 * create a copy from the passed entity object and return it.The returned object
	 * is part of persistent context and tracked for any changes, passed object is
	 * not tracked. This is the major difference with
	 * merge() from all other methods.
	 */
	public static void main(String args[]) {

		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");

		SessionFactory sf = cf.buildSessionFactory();
		Session se1 = sf.openSession(); // starting session one

		StudentPOJO s = new StudentPOJO();
		s.setId(106);
		s.setName("mohan");
		s.setMarks(729);

		se1.save(s); // save student object to database
		Transaction tx1 = se1.beginTransaction();
		tx1.commit(); // commit the transaction

		se1.close(); // closing the session one

		Session se2 = sf.openSession(); // starting session two
		s.setName("mohan kumar");

		// merge method is used to update the persistent entity instance with new field
		// values from the detached entity instance

		se2.merge(s);
		Transaction tx2 = se2.beginTransaction();
		tx2.commit(); // commit the transaction

		se2.close(); // close the session two
		sf.close();
	}
}
