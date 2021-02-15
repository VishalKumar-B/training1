package com.motivity.Joins;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringHibernateConfiguration.class);
		Object o = applicationContext.getBean(HibernateJoins.class);
		HibernateJoins hj = (HibernateJoins) o;
		hj.insert();
		
	}
	
}
