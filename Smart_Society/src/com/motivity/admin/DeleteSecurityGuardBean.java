package com.motivity.admin;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class DeleteSecurityGuardBean {
	public int delete(int id) {

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		Query qr = se.createQuery("delete from SecurityGuardPOJO s where s.securityguard_id = ?0");
		qr.setParameter(0, id);
		int a = qr.executeUpdate();

		tx.commit();
		if (a != 0)
			System.out.println("record deleted");

		return a;
	}
}
