package com.motivity;

import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	@Autowired
	private Session session;

	Scanner sc = new Scanner(System.in);

	public void insert() {
		Student s = new Student();

		System.out.println("enter student id: ");
		s.setId(sc.nextInt());
		System.out.println("enter student name: ");
		s.setName(sc.next());
		System.out.println("enter student marks: ");
		s.setMarks(sc.nextInt());

		session = session.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Object o = session.save(s);
		transaction.commit();

		if (o != null)
			System.out.println("inserted");
		else
			System.out.println("failed");

		session.close();
	}

	public void display() {
		session = session.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		Query q = session.createQuery("from Student s");
		List<Student> list = q.list();

		for (Student s : list) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks());
		}

		session.close();
	}

	public void update() {
		Student s = new Student();

		System.out.println("enter student id: ");
		s.setId(sc.nextInt());
		System.out.println("enter updated marks: ");
		s.setMarks(sc.nextInt());

		session = session.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		String sql = "update Student s set s.marks=?0 where s.id=?1";
		Query qr = session.createQuery(sql);
		qr.setParameter(0, s.getMarks());
		qr.setParameter(1, s.getId());
		int i = qr.executeUpdate();
		transaction.commit();

		if (i > 0)
			System.out.println("updated");
		else
			System.out.println("failed");

		session.close();
	}

	public void delete() {
		Student s = new Student();

		System.out.println("enter student id to delete: ");
		s.setId(sc.nextInt());

		session = session.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		String sql = "delete from Student s where s.id=?0";
		Query qr = session.createQuery(sql);
		qr.setParameter(0, s.getId());
		int i = qr.executeUpdate();
		transaction.commit();

		if (i > 0)
			System.out.println("deleted");
		else
			System.out.println("failed");

		session.close();
	}

}
