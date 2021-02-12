package com.motivity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class HibernateCrudOperations {
	
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public Object insert(Student s) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Object o = session.save(s);
		tx.commit();
		return o;
	}
	
	public List<Student> select() {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String sql = "from Student s";
		Query<Student> qr = session.createQuery(sql,Student.class);
		List<Student> list = qr.list();
		tx.commit();
		session.close();
		return list;
	}
	
	public int update(Student s) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String sql = "update Student s set s.marks=?0 where s.id=?1";
		Query<Student> qr = session.createQuery(sql,Student.class);
		qr.setParameter(0, s.getMarks());
		qr.setParameter(1, s.getId());
		int i = qr.executeUpdate();
		tx.commit();
		session.close();
		return i;
	}
	
	public int delete(Student s) {
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String sql = "delete from Student s where s.id=?0";
		Query<Student> qr = session.createQuery(sql,Student.class);
		qr.setParameter(0, s.getId());
		int i = qr.executeUpdate();
		tx.commit();
		session.close();
		return i;
	}
}
