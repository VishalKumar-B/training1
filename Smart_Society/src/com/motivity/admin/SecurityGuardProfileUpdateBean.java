package com.motivity.admin;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.securityguard.SecurityGuardPOJO;

public class SecurityGuardProfileUpdateBean {

	public int update(SecurityGuardPOJO sgp) {

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		Query qr = se.createQuery(
				"update SecurityGuardPOJO s set s.securityguard_name=?0, s.securityguard_experience=?1, s.securityguard_phone=?2, s.securityguard_address=?3 where s.securityguard_id=?4");

		qr.setParameter(0, sgp.getSecurityguard_name());
		qr.setParameter(1, sgp.getSecurityguard_experience());
		qr.setParameter(2, sgp.getSecurityguard_phone());
		qr.setParameter(3, sgp.getSecurityguard_address());
		qr.setParameter(4, sgp.getSecurityguard_id());

		int a = qr.executeUpdate();
		tx.commit();

		return a;
	}

}
