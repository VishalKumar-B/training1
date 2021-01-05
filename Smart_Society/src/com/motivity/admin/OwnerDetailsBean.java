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
		Session se = c.con();
		Transaction tx = se.beginTransaction();
		list = se.createQuery("from OwnerPOJO s where s.registration_status='accepted'").list();
		return list;
	}

	public List<OwnerPOJO> getdetails(int flat_number) {
		List<OwnerPOJO> list = new ArrayList<OwnerPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from OwnerPOJO s where s.flatnumber='" + flat_number + "' and s.registration_status='accepted'").list();
		return list;

	}
	
	public List<OwnerPOJO> viewRequests() {
		List<OwnerPOJO> list = new ArrayList<OwnerPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();
		list = se.createQuery("from OwnerPOJO s where s.registration_status IS NULL").list();
		return list;
	}
	
}
