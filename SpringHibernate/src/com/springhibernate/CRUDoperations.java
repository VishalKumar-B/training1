package com.springhibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.Transactional;

public class CRUDoperations {

	HibernateTemplate template;

	private HibernateTransactionManager transactionManager;

	public void setTransactionManager(HibernateTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional
	public Object insert(Student s) {
		Object o = template.save(s);
		return o;
	}

	public int update(Student s) {
		Session session = template.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String sql = "update Student s set s.marks = ?0 where s.id = ?1";
		Query<Student> qr = session.createQuery(sql,Student.class);
		qr.setParameter(0, s.getMarks());
		qr.setParameter(1, s.getId());
		int i = qr.executeUpdate();
		tx.commit();
		session.close();
		return i;
	}

	public int delete(Student s) {
		Session session = template.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String sql = "delete from Student s where s.id=?0";
		Query<Student> qr = session.createQuery(sql,Student.class);
		qr.setParameter(0, s.getId());
		int i = qr.executeUpdate();
		tx.commit();
		session.close();
		return i;
	}
	
	public List<Student> select() {
		Session session = template.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String sql = "from Student s";
		Query<Student> qr = session.createQuery(sql,Student.class);
		List<Student> list = qr.list();
		tx.commit();
		session.close();
		return list;
	}
}
