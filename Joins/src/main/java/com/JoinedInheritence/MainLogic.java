package com.JoinedInheritence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringHibernateConfiguration.class);
		Object o = applicationContext.getBean(JoinedInheritence.class);
		JoinedInheritence ji = (JoinedInheritence) o;
		ji.insert();
		
	}
}
