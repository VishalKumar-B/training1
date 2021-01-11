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

		VendorPOJO vp1 = new VendorPOJO();
		vp1.setVendor_id(101);
		vp1.setVendor_name("Amazon");

		VendorPOJO vp2 = new VendorPOJO();
		vp2.setVendor_id(102);
		vp2.setVendor_name("Flipkart");

		CustomerPOJO cp1 = new CustomerPOJO();
		cp1.setCustomer_name("raju");
		cp1.setFvid(vp1.getVendor_id());

		CustomerPOJO cp2 = new CustomerPOJO();
		cp2.setCustomer_name("mohan");
		cp2.setFvid(vp1.getVendor_id());

		Set<CustomerPOJO> s = new HashSet<>();
		s.add(cp1);
		s.add(cp2);
		vp1.setCustomer(s);

		CustomerPOJO cp3 = new CustomerPOJO();
		cp3.setCustomer_name("kiran");
		cp3.setFvid(vp2.getVendor_id());

		Set<CustomerPOJO> s1 = new HashSet<>();
		s1.add(cp3);
		vp2.setCustomer(s1);

		se.save(vp1);
		se.save(vp2);
		tx.commit();

	}
}
