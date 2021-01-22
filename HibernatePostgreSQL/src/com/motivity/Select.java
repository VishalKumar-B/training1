package com.motivity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Select {

	public static void main(String[] args) {
		
		Session se = DBConnection.con();
		Transaction tx = se.beginTransaction();
		
		Query qr = se.createQuery("from StudentTwoPOJO s");
		List<StudentTwoPOJO> list = qr.list();
		for(StudentTwoPOJO s : list) {
			System.out.println(s.getStudent_id()+" "+s.getStudent_name()+" "+s.getStudent_marks());
		}

	}

}
