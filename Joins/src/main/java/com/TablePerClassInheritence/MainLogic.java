package com.TablePerClassInheritence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringHibernateConfiguration.class);
		Object o = applicationContext.getBean(TablePerClass.class);
		TablePerClass tpc = (TablePerClass) o;
		tpc.insert();
	}

}
