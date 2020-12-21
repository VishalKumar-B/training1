package com.motivity.owner;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.securityguard.CourierPOJO;

public class OwnerViewCouriersBean {
	public List<CourierPOJO> getdetails(int flatnumber) {
		List<CourierPOJO> list = new ArrayList<CourierPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from CourierPOJO s where s.courier_flat_number='"+flatnumber+"'").list();
		return list;
	}
}
