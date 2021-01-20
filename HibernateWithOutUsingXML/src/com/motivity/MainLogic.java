package com.motivity;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {

		Session se = DBConnection.con();
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
	}

}
