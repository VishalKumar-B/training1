package com.motivity.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {

	public SessionFactory con() {
	Configuration cf = new Configuration();
	cf.configure("/com/motivity/configuration/Configuration.xml");
	SessionFactory sf = cf.buildSessionFactory();
	return sf;
	}
}