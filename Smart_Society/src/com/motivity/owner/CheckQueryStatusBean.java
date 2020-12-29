package com.motivity.owner;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class CheckQueryStatusBean {

	public List<QueryPOJO> getstatus(int owner_id) {
		List<QueryPOJO> list = new ArrayList<QueryPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from QueryPOJO q where q.owner_id='" + owner_id + "'").list();
		return list;
	}

}
