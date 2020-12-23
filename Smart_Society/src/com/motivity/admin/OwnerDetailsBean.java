package com.motivity.admin;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.owner.OwnerPOJO;

public class OwnerDetailsBean {

	public List<OwnerPOJO> getdetails() {
		List<OwnerPOJO> list = new ArrayList<OwnerPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		list = se.createQuery("from OwnerPOJO s").list();
		return list;
	}
	
	public List<OwnerPOJO> getdetails(int flat_number) {
		List<OwnerPOJO> list = new ArrayList<OwnerPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from OwnerPOJO s where s.flatnumber='"+flat_number+"'").list();
		return list;

	}
}
