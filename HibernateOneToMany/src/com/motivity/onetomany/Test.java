package com.motivity.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {

		Config cf = new Config();
		Session se = cf.con();
		Transaction tx = se.beginTransaction();

		CustomerPOJO cp1 = new CustomerPOJO();
		cp1.setCustomer_name("raju");
		

		CustomerPOJO cp2 = new CustomerPOJO();
		cp2.setCustomer_name("mohan");
		
		CustomerPOJO cp3 = new CustomerPOJO();
		cp2.setCustomer_name("madhu");
		

		Set<CustomerPOJO> s1 = new HashSet<>();
		s1.add(cp1);
		s1.add(cp2);
		
		Set<CustomerPOJO> s2 = new HashSet<>();
		s2.add(cp3);
		

		VendorPOJO vp1 = new VendorPOJO();
		vp1.setVendor_id(101);
		vp1.setVendor_name("Amazon");
		vp1.setCustomer(s1);
		
		VendorPOJO vp2 = new VendorPOJO();
		vp2.setVendor_id(102);
		vp2.setVendor_name("Flipkart");
		vp2.setCustomer(s2);
		
		se.save(vp1);
		se.save(vp2);
		tx.commit();

	}
}
