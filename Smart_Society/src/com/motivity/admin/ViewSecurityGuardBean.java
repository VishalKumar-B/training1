package com.motivity.admin;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.motivity.configuration.Config;
import com.motivity.securityguard.SecurityGuardPOJO;

public class ViewSecurityGuardBean {

	public List<SecurityGuardPOJO> getdetails() {
		List<SecurityGuardPOJO> list = new ArrayList<SecurityGuardPOJO>();

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		list = se.createQuery("from SecurityGuardPOJO s").list();
		return list;
	}
}
