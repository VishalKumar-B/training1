package com.motivity.securityguard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

class IdComparator implements Comparator<CourierPOJO> {
	public int compare(CourierPOJO obj1, CourierPOJO obj2) {
		return (obj1.getCourier_id() < obj2.getCourier_id()) ? -1
				: (obj1.getCourier_id() > obj2.getCourier_id()) ? 1 : 0;
	}
}

public class SecurityGuardViewCouriersBean {

	public List<CourierPOJO> getdetails() {
		List<CourierPOJO> list = new ArrayList<CourierPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from CourierPOJO s").list();

		Collections.sort(list, new IdComparator());
		Comparator<CourierPOJO> cmp = Collections.reverseOrder(new IdComparator());
		Collections.sort(list, cmp);
		return list;
	}
}
