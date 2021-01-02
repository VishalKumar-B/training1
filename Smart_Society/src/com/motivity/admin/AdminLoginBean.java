package com.motivity.admin;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.owner.OwnerPOJO;

public class AdminLoginBean {

	public int admin_Login(AdminPOJO ap) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		String query = "from AdminPOJO a where a.admin_email=?0 and a.admin_password=?1";
		Query qr = se.createQuery(query);
		qr.setParameter(0, ap.getAdmin_email());
		qr.setParameter(1, ap.getAdmin_password());

		List<AdminPOJO> li = qr.list();
		Iterator<AdminPOJO> i = li.iterator();
		
		while(i.hasNext())	{
			AdminPOJO s = i.next();
			ap.setAdmin_email(s.getAdmin_email());
			ap.setAdmin_id(s.getAdmin_id());
			ap.setAdmin_password(s.getAdmin_password());
		}
		
		int result = li.size();
		
		if (result > 0) {
			System.out.println("logged in");

		}
		return result;
	}

	
}
