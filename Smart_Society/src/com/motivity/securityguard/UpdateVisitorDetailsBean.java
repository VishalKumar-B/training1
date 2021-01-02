package com.motivity.securityguard;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class UpdateVisitorDetailsBean {

	public Object update(VisitorsPOJO vp) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		vp.getVisitor_name();
		vp.getVisitor_mobile();
		vp.getVisitor_aadhar_id();
		vp.getVisitor_visit_flat();
		vp.getVisitor_visit_name();
		vp.getVisitor_visit_time();

		Object a = se.save(vp);
		tx.commit();

		if (a != null)
			System.out.println("record inserted");

		se.close();
		return a;

	}

}
