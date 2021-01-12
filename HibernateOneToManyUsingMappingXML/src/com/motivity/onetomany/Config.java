package com.motivity.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {

	public Session con() {
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		return se;
	}
}