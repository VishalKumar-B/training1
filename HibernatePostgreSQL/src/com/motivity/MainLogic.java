package com.motivity;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {

		Session se = DBConnection.con();
		Transaction tx = se.beginTransaction();

		StudentTwoPOJO s = new StudentTwoPOJO();
		s.setStudent_id(2);
		s.setStudent_name("raju");
		s.setStudent_marks(899);

		EmployeeTwo e = new EmployeeTwo();
		e.setEmp_id(3);
		e.setEmp_name("mohan");

		se.save(s);
		se.save(e);

		tx.commit();
		se.close();
	}

}
