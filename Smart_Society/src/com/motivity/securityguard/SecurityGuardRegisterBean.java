package com.motivity.securityguard;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.motivity.configuration.Config;

public class SecurityGuardRegisterBean {

	public Object register(SecurityGuardPOJO sgp) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		sgp.getSecurityguard_name();
		sgp.getSecurityguard_phone();
		sgp.getSecurityguard_email();
		sgp.getSecurityguard_address();
		sgp.getSecurityguard_education();
		sgp.getSecurityguard_aadhar();
		sgp.getSecurityguard_experience();
		sgp.getSecurityguard_password();

		Object a = se.save(sgp);
		tx.commit();

		if (a != null)
			System.out.println("record inserted");

		se.close();
		return a;
	}
}
