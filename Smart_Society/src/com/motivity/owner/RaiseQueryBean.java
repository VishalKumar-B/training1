package com.motivity.owner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class RaiseQueryBean {

	public Object raiseQuery(QueryPOJO qp) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		qp.getOwner_id();
		qp.getOwner_name();
		qp.getOwner_email();
		qp.getOwner_flat_number();
		qp.getComplaint();

		Object a = se.save(qp);
		tx.commit();

		if (a != null)
			System.out.println("record inserted");

		se.close();

		return a;
	}

}
