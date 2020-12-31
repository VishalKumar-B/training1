package com.motivity.owner;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class OwnerViewPaymentHistoryBean {

	public List<PaymentPOJO> getdetails(int owner_id) {
		List<PaymentPOJO> list = new ArrayList<PaymentPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from PaymentPOJO p where p.owner_id='"+owner_id+"'").list();
		return list;
	}
	
	public List<PaymentPOJO> getdetails() {
		List<PaymentPOJO> list = new ArrayList<PaymentPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from PaymentPOJO p").list();
		return list;
	}

	public List<PaymentPOJO> getdetails(String from_date, String to_date) {
		List<PaymentPOJO> list = new ArrayList<PaymentPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from PaymentPOJO p where date between '"+from_date+"' and '"+to_date+"'").list();
		return list;
	}


}
