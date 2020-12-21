package com.motivity.owner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class OwnerRegisterBean {

	public Object register(OwnerPOJO op)
	{
		Config c = new Config();
		SessionFactory sf = c.con();
		
		
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		
		op.getFlatnumber();
		op.getAdharnumber();
		op.getEmailid();
		op.getDateofjoing();
		op.getFlattype();
		op.getPassword();
		op.getGender();
		op.getMobilenumber();
		op.getName();
		op.getFloornumber();
		
		Object a = se.save(op);
		tx.commit();
		
		if(a!=null)
			System.out.println("record inserted");
		
		se.close();
		return a;
	}
}
