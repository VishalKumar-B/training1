package com.motivity.owner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.securityguard.VisitorsPOJO;

class PaymentIdComparator implements Comparator<PaymentPOJO> {
	public int compare(PaymentPOJO obj1, PaymentPOJO obj2) {
		return (obj1.getPayment_id() < obj2.getPayment_id()) ? -1
				: (obj1.getPayment_id() > obj2.getPayment_id()) ? 1 : 0;
	}
}

public class OwnerViewPaymentHistoryBean {

	public List<PaymentPOJO> getdetails(int owner_id) {
		List<PaymentPOJO> list = new ArrayList<PaymentPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from PaymentPOJO p where p.owner_id='" + owner_id + "'").list();

		Collections.sort(list, new PaymentIdComparator());
		Comparator<PaymentPOJO> cmp = Collections.reverseOrder(new PaymentIdComparator());
		Collections.sort(list, cmp);

		return list;
	}

	public List<PaymentPOJO> getdetails() {
		List<PaymentPOJO> list = new ArrayList<PaymentPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from PaymentPOJO p").list();

		Collections.sort(list, new PaymentIdComparator());
		Comparator<PaymentPOJO> cmp = Collections.reverseOrder(new PaymentIdComparator());
		Collections.sort(list, cmp);

		return list;
	}

	public List<PaymentPOJO> getdetails(String from_date, String to_date) {
		List<PaymentPOJO> list = new ArrayList<PaymentPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from PaymentPOJO p where date between '" + from_date + "' and '" + to_date + "'").list();
		return list;
	}

}
