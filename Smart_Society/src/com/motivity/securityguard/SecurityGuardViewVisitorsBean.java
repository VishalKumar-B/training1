package com.motivity.securityguard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

class VisitorIdComparator implements Comparator<VisitorsPOJO> {
	public int compare(VisitorsPOJO obj1, VisitorsPOJO obj2) {
		return (obj1.getVisitor_id() < obj2.getVisitor_id()) ? -1
				: (obj1.getVisitor_id() > obj2.getVisitor_id()) ? 1 : 0;
	}
}

public class SecurityGuardViewVisitorsBean {

	public List<VisitorsPOJO> getdetails() {
		List<VisitorsPOJO> list = new ArrayList<VisitorsPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from VisitorsPOJO s").list();
		Collections.sort(list, new VisitorIdComparator());
		Comparator<VisitorsPOJO> cmp = Collections.reverseOrder(new VisitorIdComparator());
		Collections.sort(list, cmp);
		return list;
	}
}
