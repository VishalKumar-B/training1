package com.motivity.admin;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.owner.QueryPOJO;

public class AdminViewQueriesBean {

	public List<QueryPOJO> getdetails() {
		List<QueryPOJO> list = new ArrayList<QueryPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from QueryPOJO q").list();
		return list;
	}

}
