package com.motivity.owner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class OwnerPaymentBean {

	public Object pay(PaymentPOJO pp) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		pp.getOwner_id();
		pp.getOwner_name();
		pp.getEmail_id();
		pp.getFlat_number();
		pp.getAmount();
		pp.getCard_type();
		pp.getCard_number();
		pp.getDate();

		Object a = se.save(pp);
		tx.commit();

		if (a != null)
			System.out.println("record inserted");

		se.close();
		return a;

	}

}
