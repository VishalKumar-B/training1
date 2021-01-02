package com.motivity.owner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

class QueryIdComparator implements Comparator<QueryPOJO> {
	public int compare(QueryPOJO obj1, QueryPOJO obj2) {
		return (obj1.getQuery_id() < obj2.getQuery_id()) ? -1 : (obj1.getQuery_id() > obj2.getQuery_id()) ? 1 : 0;
	}
}

public class CheckQueryStatusBean {

	public List<QueryPOJO> getstatus(int owner_id) {
		List<QueryPOJO> list = new ArrayList<QueryPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from QueryPOJO q where q.owner_id='" + owner_id + "'").list();

		Collections.sort(list, new QueryIdComparator());
		Comparator<QueryPOJO> cmp = Collections.reverseOrder(new QueryIdComparator());
		Collections.sort(list, cmp);

		return list;
	}

}
