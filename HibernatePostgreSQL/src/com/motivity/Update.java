package com.motivity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Update {

	public static void main(String[] args) {

		Session se = DBConnection.con();
		Transaction tx = se.beginTransaction();
		Scanner sc = new Scanner(System.in);

		Query qr = se.createQuery("update StudentTwoPOJO s set s.student_marks=?0 where s.student_id=?1");
		System.out.println("enter updated marks");
		qr.setParameter(0, sc.nextInt());
		System.out.println("enter student id");
		qr.setParameter(1, sc.nextInt());
		int i = qr.executeUpdate();
		tx.commit();
		if (i > 0)
			System.out.println("updated");
	}

}
