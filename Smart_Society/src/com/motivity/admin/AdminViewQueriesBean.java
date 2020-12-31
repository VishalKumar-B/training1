package com.motivity.admin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.owner.QueryPOJO;

class QueryIdComparator implements Comparator<QueryPOJO> {
	public int compare(QueryPOJO obj1, QueryPOJO obj2) {
		return (obj1.getQuery_id() < obj2.getQuery_id()) ? -1
				: (obj1.getQuery_id() > obj2.getQuery_id()) ? 1 : 0;
	}
}

public class AdminViewQueriesBean {

	public List<QueryPOJO> getdetails() {
		List<QueryPOJO> list = new ArrayList<QueryPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from QueryPOJO q").list();
		
		Collections.sort(list, new QueryIdComparator());
		Comparator<QueryPOJO> cmp = Collections.reverseOrder(new QueryIdComparator());
		Collections.sort(list, cmp);
		
		return list;
	}

}
