package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersistMethod {
	
/*	
    persist() is similar to save and it adds the entity object to the persistent context, 
    so any further changes are tracked. 
    If the object properties are changed before the transaction is committed or session is flushed,
    it will also be saved into database.

	Second difference is that we can use persist() method only within the boundary of a transaction, 
	so it’s safe and takes care of any cascaded objects.

	Finally, persist doesn’t return anything so we need to use the persisted object
	to get the generated identifier value. 
*/
	public static void main(String args[]) {
	
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		StudentPOJO s = new StudentPOJO();
		s.setId(105);
		s.setName("sudheer");
		s.setMarks(565);
		
		se.persist(s);
		
		Transaction tx = se.beginTransaction();
		tx.commit();
		
		se.close();
		sf.close();
	}
}
