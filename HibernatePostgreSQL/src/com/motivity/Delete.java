package com.motivity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Delete {

	public static void main(String[] args) {
		
		Session se = DBConnection.con();
		Transaction tx = se.beginTransaction();
		Scanner sc = new Scanner(System.in);
		
		Query qr = se.createQuery("delete from StudentTwoPOJO s where s.student_id=?0");
		System.out.println("enter student id to delete");
		qr.setParameter(0, sc.nextInt());
		int i = qr.executeUpdate();
		tx.commit();
		if(i>0)
			System.out.println("deleted");
	}
}
