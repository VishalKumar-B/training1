package com.motivity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {

		Config cf = new Config();
		Session se = cf.con();
		Transaction tx = se.beginTransaction();

		GroupsPOJO g1 = new GroupsPOJO();
		g1.setGroup_id(1234);
		g1.setGroup_name("cricket");

		UsersPOJO u1 = new UsersPOJO();
		u1.setUser_id(1);
		u1.setUser_name("kiran");
		u1.setUser_mobile(1234455);

		UsersPOJO u2 = new UsersPOJO();
		u2.setUser_id(2);
		u2.setUser_name("kumar");
		u2.setUser_mobile(4534232);

		Set<UsersPOJO> s1 = new HashSet<>();
		s1.add(u1);
		s1.add(u2);

		g1.setUsers(s1);

		se.save(g1);

		tx.commit();
	}

}
