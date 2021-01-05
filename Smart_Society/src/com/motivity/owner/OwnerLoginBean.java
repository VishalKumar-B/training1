package com.motivity.owner;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.securityguard.SecurityGuardPOJO;

public class OwnerLoginBean {

	public int owner_Login(OwnerPOJO op) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		String query = "from OwnerPOJO s where s.emailid=?0 and s.password=?1  and s.registration_status='accepted'";
		Query qr = se.createQuery(query);
		qr.setParameter(0, op.getEmailid());
		qr.setParameter(1, op.getPassword());

		List<OwnerPOJO> li = qr.list();
		Iterator<OwnerPOJO> i = li.iterator();

		while (i.hasNext()) {
			OwnerPOJO s = i.next();
			op.setId(s.getId());
			op.setFlatnumber(s.getFlatnumber());
			System.out.println(s.getId() + " " + s.getFlatnumber());
		}

		int result = li.size();
		if (result > 0) {
			System.out.println("logged in");

		}
		return result;
	}
}
