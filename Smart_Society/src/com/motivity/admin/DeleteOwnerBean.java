package com.motivity.admin;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.securityguard.SecurityGuardPOJO;

public class DeleteOwnerBean {

	public int delete(int id) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		Query qr = se.createQuery("delete from OwnerPOJO s where s.id = ?0");
		qr.setParameter(0, id);
		int a = qr.executeUpdate();

		tx.commit();
		if (a != 0)
			System.out.println("record deleted");

		return a;
	}
}
