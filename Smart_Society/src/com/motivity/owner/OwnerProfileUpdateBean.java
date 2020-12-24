package com.motivity.owner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class OwnerProfileUpdateBean {

	public int update(OwnerPOJO op)
	{
		Config c = new Config();
		SessionFactory sf = c.con();
		
		
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		Query qr = se.createQuery("update OwnerPOJO o set o.name=?0, o.emailid=?1, o.mobilenumber=?2  where o.id=?3 and o.password=?4");
		
		qr.setParameter(0, op.getName());
		qr.setParameter(1, op.getEmailid());
		qr.setParameter(2, op.getMobilenumber());
		qr.setParameter(3, op.getId());
		qr.setParameter(4, op.getPassword());
		
		int a = qr.executeUpdate();
		tx.commit();
		return a;
	}
}
