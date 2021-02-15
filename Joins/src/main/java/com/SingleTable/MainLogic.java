package com.SingleTable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringHibernateConfiguration.class);
		Object o = applicationContext.getBean(SingleTableInheritence.class);
		SingleTableInheritence sti = (SingleTableInheritence) o;
		sti.insert();

	}
}
