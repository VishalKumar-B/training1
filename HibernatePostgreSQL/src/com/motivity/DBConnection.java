package com.motivity;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {

	public static Session con() {
		Properties p = new Properties();
		p.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/example");
		p.setProperty("hibernate.connection.username", "postgres");
		p.setProperty("hibernate.connection.password", "root");
		p.setProperty("dialet", "org.hibernate.dialect.PostgreSQLDialect");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");

		Configuration cf = new Configuration();
		cf.addProperties(p);
		cf.addAnnotatedClass(StudentTwoPOJO.class);
		cf.addAnnotatedClass(EmployeeTwo.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();

		return se;
	}
}
