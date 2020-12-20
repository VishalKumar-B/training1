package com.motivity.securityguard;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class SecurityGuardLoginBean {

	public int securityguard_Login(SecurityGuardPOJO sgp) {

		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		String query = "from SecurityGuardPOJO s where s.securityguard_email = ?0 and s.securityguard_password = ?1";
		Query qr = se.createQuery(query);
		qr.setParameter(0, sgp.getSecurityguard_email());
		qr.setParameter(1, sgp.getSecurityguard_password());

		List<SecurityGuardPOJO> li = qr.list();
		Iterator<SecurityGuardPOJO> i = li.iterator();
		
		while(i.hasNext())	{
			SecurityGuardPOJO s = i.next();
			sgp.setSecurityguard_id(s.getSecurityguard_id());
			System.out.println(s.getSecurityguard_id()); 
		}
		
		int result = li.size();
		if (result > 0) {
			System.out.println("logged in");
		}
		return result;
	}
}
