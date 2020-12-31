package com.motivity.admin;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class UpdateRentBean {

	public int updateRent(String update_value, String flat_type) {

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		Query qr = se.createQuery(
				"update RentPOJO r set r.rent= '" + update_value + "' where r.flat_type='" + flat_type + "'");

		int a = qr.executeUpdate();

		tx.commit();
		if (a != 0)
			System.out.println("updated");

		return a;
	}
}
