package com.motivity.Joins;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class HibernateJoins {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert() {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		CustomerPOJO cp1 = new CustomerPOJO();
		cp1.setCustomer_name("raju");
		

		CustomerPOJO cp2 = new CustomerPOJO();
		cp2.setCustomer_name("mohan");
		
		CustomerPOJO cp3 = new CustomerPOJO();
		cp3.setCustomer_name("madhu");
		

		Set<CustomerPOJO> s1 = new HashSet<CustomerPOJO>();
		s1.add(cp1);
		s1.add(cp2);
		
		Set<CustomerPOJO> s2 = new HashSet<CustomerPOJO>();
		s2.add(cp3);
		

		VendorPOJO vp1 = new VendorPOJO();
		vp1.setVendor_id(101);
		vp1.setVendor_name("Amazon");
		vp1.setCustomer(s1);
		
		VendorPOJO vp2 = new VendorPOJO();
		vp2.setVendor_id(102);
		vp2.setVendor_name("Flipkart");
		vp2.setCustomer(s2);
		
		Object obj1 = session.save(vp1);
		Object obj2 = session.save(vp2);
		tx.commit();
		session.close();
		if(obj1!=null && obj2!=null)
			System.out.println("inserted");
	}
	
}
