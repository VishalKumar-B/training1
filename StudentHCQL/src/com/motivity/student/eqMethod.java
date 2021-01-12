package com.motivity.student;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class eqMethod {

	// public static SimpleExpression eq(String propertyName,Object value) sets the
	// equal constraint to the given property.

	public static void main(String[] args) {

		Config c = new Config();
		Session se = c.con();
		Transaction tx = se.beginTransaction();

		Criteria crt = se.createCriteria(Student25POJO.class);
		Criterion cn = Restrictions.eq("student_section", new String("B"));
		
		crt.add(cn);
		List<Student25POJO> li = crt.list();

		for (Student25POJO sp : li) {
			System.out.println(sp.getStudent_id() + " " + sp.getStudent_name() + " " + sp.getStudent_section() + " "
					+ sp.getStudent_marks());
		}

		tx.commit();
	}
}
