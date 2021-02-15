package com.JoinedInheritence;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class JoinedInheritence {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void insert() {
		
		Session session = hibernateTemplate.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		CreditCard c = new CreditCard();
		c.setPayment_id(101);
		c.setAmount(10000);
		c.setCard_type("visa");
		
		Cheque ch = new Cheque();
		ch.setPayment_id(102);
		ch.setAmount(6000);
		ch.setCheque_type("ICICI");

		session.save(c);
		session.save(ch);
		tx.commit();
		session.close();
	}
}
