package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLSelect {

	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		//select all records
		
		
		Query qr = se.createQuery("from StudentPOJO s");
		List<StudentPOJO> li = qr.list();
		Iterator<StudentPOJO> i = li.iterator();
		
		while(i.hasNext())	{
			StudentPOJO s = i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()); 
		}
		
		
		
		//for selecting the particular column
		
		/*
		Query qr = se.createQuery("select s.id, s.name from StudentPOJO s");
		List li = qr.list();
		Iterator i = li.iterator();
		
		while(i.hasNext())	{
			
				Object[] s = (Object[])i.next();
				System.out.println(s[0]+" "+s[1]);
		}
		*/
		
		//for displaying only id(int) from student
		
		/*
		 * Query qr = se.createQuery("select s.id from StudentPOJO s"); 
		 * List li = qr.list(); 
		 * Iterator i = li.iterator();
		 * 
		 * while(i.hasNext()) { 
		 * Integer s = (Integer)i.next();
		 * System.out.println(s.intValue()); 
		 * }
		 */
		
		//for displaying name form student(String)
		
		/*
		 * Query qr = se.createQuery("select s.name from StudentPOJO s"); 
		 * List li = qr.list(); 
		 * Iterator i = li.iterator();
		 * 
		 * while(i.hasNext()) { 
		 * String s = (String)i.next(); 
		 * System.out.println(s); 
		 * }
		 */		
		
		//for displaying particular student record
		
		/*
		 * Query qr = se.createQuery("from StudentPOJO s where s.id=?0");
		 * qr.setParameter(0, 101); 
		 * List<StudentPOJO> li = qr.list();
		 * Iterator<StudentPOJO> i = li.iterator();
		 * 
		 * while(i.hasNext()) { 
		 * StudentPOJO s = (StudentPOJO) i.next();
		 * System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()); 
		 * }
		 */
		
		//for displaying multiple student records using palceholders
		
		/*
		 * Query qr = se.createQuery("from StudentPOJO s where s.id in(?0,?1)");
		 * qr.setParameter(0, 101); 
		 * qr.setParameter(1, 102); 
		 * List<StudentPOJO> li = qr.list(); 
		 * Iterator<StudentPOJO> i = li.iterator();
		 * 
		 * while(i.hasNext()) { 
		 * StudentPOJO s = (StudentPOJO) i.next();
		 * System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()); 
		 * }
		 */
		
		//for displaying multiple student records using labels
		
		/*
		 * Query qr = se.createQuery("from StudentPOJO s where s.id in(:x,:y)");
		 * qr.setParameter("x", 101); 
		 * qr.setParameter("y", 104); 
		 * List<StudentPOJO> li = qr.list(); 
		 * Iterator<StudentPOJO> i = li.iterator();
		 * 
		 * while(i.hasNext()) { 
		 * StudentPOJO s = (StudentPOJO) i.next();
		 * System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()); 
		 * }
		 * 
		 * Transaction tx = se.beginTransaction(); 
		 * tx.commit();
		 */
		
		se.close();
		sf.close();
	}

}
