package com.motivity.securityguard;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class SecurityGuardViewCouriersBean {

	public List<CourierPOJO> getdetails() {
		List<CourierPOJO> list = new ArrayList<CourierPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from CourierPOJO s").list();
		return list;
	}
}
