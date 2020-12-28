package com.motivity.admin;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.owner.OwnerPOJO;

public class ChangePasswordBean {

	public int update_password(AdminPOJO ap) {
		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		Query qr = se.createQuery(
				"update AdminPOJO a set a.admin_password=?0  where a.admin_id=?1 and a.admin_email=?2");

		qr.setParameter(0, ap.getAdmin_password());
		qr.setParameter(1, ap.getAdmin_id());
		qr.setParameter(2, ap.getAdmin_email());

		int a = qr.executeUpdate();
		tx.commit();
		return a;
	}

}
