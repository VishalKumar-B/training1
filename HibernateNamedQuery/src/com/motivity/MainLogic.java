package com.motivity;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {
		
		Session se = DBConnection.con();
		Transaction tx = se.beginTransaction();
		
		TypedQuery query = se.getNamedQuery("findbyfirstname");
		query.setParameter("name", "jhon");
		List<Student> list = query.getResultList();
		
		for(Student s : list) {
			System.out.println(s.getId()+" "+s.getFirstname()+" "+s.getLastname());
		}
	}

}
