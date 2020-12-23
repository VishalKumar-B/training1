package com.motivity.owner;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.securityguard.SecurityGuardPOJO;

public class OwnerProfileBean {
	@SuppressWarnings("unchecked")
	public List<OwnerPOJO> getdetails(int id) {
		List<OwnerPOJO> list = new ArrayList<OwnerPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		int id1 = id;
		list = se.createQuery("from OwnerPOJO s where s.id = '" + id1+ "'").list();
		return list;
	}


}
