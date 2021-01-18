package com.motivity.TablesOnlyForSubClasses;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.Config;

public class MainLogic {

	public static void main(String[] args) {
		
		Config cf = new Config();
		Session se = cf.con();
		
		Transaction tx = se.beginTransaction();
		
		CreditCard c = new CreditCard();
		c.setPayment_id(101);
		c.setAmount(10000);
		c.setCard_type("visa");
		
		Cheque ch = new Cheque();
		ch.setPayment_id(102);
		ch.setAmount(6000);
		ch.setCheque_type("ICICI");
		
		se.save(c);
		se.save(ch);
		tx.commit();
		se.close();
	}

}
