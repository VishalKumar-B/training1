package com.motivity.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class SetRentBean {

	public Object set(RentPOJO rp) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		rp.getFlat_type();
		rp.getRent();

		Object a = se.save(rp);
		tx.commit();

		if (a != null)
			System.out.println("rent set successfully");

		se.close();

		return a;
	}

}
