package com.motivity;

import java.util.Properties;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {

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
		cf.addAnnotatedClass(StudentTwoPOJO.class);
		cf.addAnnotatedClass(EmployeeTwo.class);

		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		StudentTwoPOJO s = new StudentTwoPOJO();
		s.setStudent_id(4);
		s.setStudent_name("sachin");
		s.setStudent_marks(499);

		EmployeeTwo e = new EmployeeTwo();
		e.setEmp_id(1);
		e.setEmp_name("kiran");

		se.save(s);
		se.save(e);

		tx.commit();
		se.close();
		sf.close();
	}

}
