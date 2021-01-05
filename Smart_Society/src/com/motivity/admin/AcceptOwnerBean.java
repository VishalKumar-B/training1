package com.motivity.admin;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class AcceptOwnerBean {

	public int accept(int id) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		Query qr = se.createQuery("update OwnerPOJO s set registration_status='accepted' where s.id = ?0");
		qr.setParameter(0, id);
		int a = qr.executeUpdate();

		tx.commit();
		if (a != 0)
			System.out.println("accepted");

		return a;
	}
}
