package com.motivity.admin;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class UpdateQueryStatus {

	public int update(int query_id, String updatevalue) {

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		Query qr = se.createQuery("update QueryPOJO q set q.status= '"+updatevalue+"' where q.query_id='"+query_id+"'");
		
		int a = qr.executeUpdate();

		tx.commit();
		if (a != 0)
			System.out.println("status updated");

		return a;
	}
}
