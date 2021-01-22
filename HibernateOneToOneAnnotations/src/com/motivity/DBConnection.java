package com.motivity;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {

	public static Session con() {
		Properties p = new Properties();
		p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/motivity");
		p.setProperty("hibernate.connection.username", "root");
		p.setProperty("hibernate.connection.password", "root");
		p.setProperty("dialet", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto", "create");

		Configuration cf = new Configuration();
		cf.addProperties(p);
		cf.addAnnotatedClass(Student.class);
		cf.addAnnotatedClass(ContactInformation.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();

		return se;
	}
}
