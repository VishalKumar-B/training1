package com.motivity.securityguard;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class SecurityGuardChangePasswordBean {

	public int update_password(SecurityGuardPOJO sp) {
		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		Query qr = se
				.createQuery("update SecurityGuardPOJO s set s.securityguard_password=?0  where s.securityguard_id=?1");

		qr.setParameter(0, sp.getSecurityguard_password());
		qr.setParameter(1, sp.getSecurityguard_id());

		int a = qr.executeUpdate();
		tx.commit();
		return a;
	}

}
