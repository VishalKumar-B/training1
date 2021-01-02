package com.motivity.admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class AdminRegisterBean {

	public Object register(AdminPOJO ap) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		ap.getAdmin_name();
		ap.getAdmin_email();
		ap.getAdmin_password();

		Object a = se.save(ap);
		tx.commit();

		if (a != null)
			System.out.println("record inserted");

		se.close();

		return a;
	}

}
