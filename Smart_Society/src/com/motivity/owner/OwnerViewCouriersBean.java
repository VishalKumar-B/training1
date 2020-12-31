package com.motivity.owner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.securityguard.CourierPOJO;

class CourierIdComparator implements Comparator<CourierPOJO> {
	public int compare(CourierPOJO obj1, CourierPOJO obj2) {
		return (obj1.getCourier_id() < obj2.getCourier_id()) ? -1
				: (obj1.getCourier_id() > obj2.getCourier_id()) ? 1 : 0;
	}
}

public class OwnerViewCouriersBean {
	public List<CourierPOJO> getdetails(int flatnumber) {
		List<CourierPOJO> list = new ArrayList<CourierPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from CourierPOJO s where s.courier_flat_number='"+flatnumber+"'").list();
		
		Collections.sort(list, new CourierIdComparator());
		Comparator<CourierPOJO> cmp = Collections.reverseOrder(new CourierIdComparator());
		Collections.sort(list, cmp);
		
		return list;
	}
}
