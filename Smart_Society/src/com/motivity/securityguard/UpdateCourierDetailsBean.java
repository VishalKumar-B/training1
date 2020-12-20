package com.motivity.securityguard;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class UpdateCourierDetailsBean {

	public Object update(CourierPOJO cp) {
		
		Config c = new Config();
		SessionFactory sf = c.con();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		cp.getCourier_flat_number();
		cp.getCourier_receiver_name();
		cp.getCourier_from_address();
		cp.getCourier_received_date();
		cp.getCourier_received_time();
				
		Object a = se.save(cp);
		tx.commit();
		
		if(a!=null)
			System.out.println("record inserted");
		
		se.close();
		return a;
		
	}

}
