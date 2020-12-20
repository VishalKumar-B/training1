package com.motivity.securityguard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class SecurityGuardProfileBean {

	public List<SecurityGuardPOJO> getdetails(int sid) {
		List<SecurityGuardPOJO> list = new ArrayList<SecurityGuardPOJO>();

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		int id = sid;
		list = se.createQuery("from SecurityGuardPOJO s where s.securityguard_id = '" + id + "'").list();
		return list;
	}

}
