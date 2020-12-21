package com.motivity.securityguard;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class SecurityGuardViewVisitorsBean {

	public List<VisitorsPOJO> getdetails() {
		List<VisitorsPOJO> list = new ArrayList<VisitorsPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from VisitorsPOJO s").list();
		return list;
	}
}
