package com.motivity.admin;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;

public class ViewRentBean {

	public List<RentPOJO> getdetails() {
		List<RentPOJO> list = new ArrayList<RentPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from RentPOJO r").list();
		return list;
	}

	public List<RentPOJO> getdetails(String flat_type) {

		List<RentPOJO> list = new ArrayList<RentPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from RentPOJO r where r.flat_type='" + flat_type + "'").list();
		return list;
	}
}
