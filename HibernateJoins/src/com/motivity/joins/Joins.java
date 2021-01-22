package com.motivity.joins;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Joins {

	public static void main(String[] args) {

		Session se = DBConnection.con();
		Transaction tx = se.beginTransaction();

		VendorPOJO vp = new VendorPOJO();
		vp.setVendor_id(1);
		vp.setVendor_name("amazon");

		VendorPOJO vp1 = new VendorPOJO();
		vp1.setVendor_id(2);
		vp1.setVendor_name("Flipkart");

		CustomerPOJO cp1 = new CustomerPOJO();
		cp1.setCustomer_id(1);
		cp1.setCustomer_name("kiran");

		CustomerPOJO cp2 = new CustomerPOJO();
		cp2.setCustomer_id(2);
		cp2.setCustomer_name("kumar");

		CustomerPOJO cp3 = new CustomerPOJO();
		cp3.setCustomer_id(3);
		cp3.setCustomer_name("ram");

		CustomerPOJO cp4 = new CustomerPOJO();
		cp4.setCustomer_id(4);
		cp4.setCustomer_name("prashant");

		Set<CustomerPOJO> s = new HashSet<>();
		s.add(cp1);
		s.add(cp3);

		Set<CustomerPOJO> s1 = new HashSet<>();
		s1.add(cp2);
		s1.add(cp4);

		vp.setCustomer(s);
		vp1.setCustomer(s1);

		se.save(cp1);
		se.save(cp2);
		se.save(cp3);
		se.save(cp4);
		se.save(vp);
		se.save(vp1);
		tx.commit();

		/*
		 * System.out.println("inner join"); Query qr = se.
		 * createQuery("select v.vendor_name,c.customer_name from VendorPOJO v INNER JOIN v.customer c"
		 * );
		 */
		/*
		 * System.out.println("left join"); Query qr = se.
		 * createQuery("select v.vendor_name,c.customer_name from VendorPOJO v LEFT JOIN v.customer c"
		 * );
		 */

		System.out.println("right join");
		Query qr = se.createQuery("select v.vendor_name,c.customer_name from VendorPOJO v RIGHT JOIN v.customer c");

		List<Object[]> list = qr.list();

		for (Object[] ob : list) {
			System.out.println(Arrays.toString(ob));
		}
	}

}
