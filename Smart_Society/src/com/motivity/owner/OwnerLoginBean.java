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
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		String query = "from OwnerPOJO s where s.emailid=?0 and s.password=?1";
		Query qr = se.createQuery(query);
		qr.setParameter(0, op.getEmailid());
		qr.setParameter(1, op.getPassword());

		List<OwnerPOJO> li = qr.list();
		Iterator<OwnerPOJO> i = li.iterator();
		
		while(i.hasNext())	{
			OwnerPOJO s = i.next();
			op.setId(s.getId());
			System.out.println(s.getId()); 
		}
		
		int result = li.size();
		if (result > 0) {
			System.out.println("logged in");

		}
		return result;
	}
}
