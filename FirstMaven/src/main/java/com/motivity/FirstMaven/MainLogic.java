package com.motivity.FirstMaven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringJDBCConfiguration.class);
	Object o = applicationContext.getBean(JdbcCrudOperatios.class);
	JdbcCrudOperatios jco = (JdbcCrudOperatios)o; 
	
	//select operation
	jco.select();
	
	//insert operation
	
	/* One one = new One(); one.setId(2); one.setName("kumar"); jco.insert(one); */
	 
	
	//update operation
	
	/* One one = new One(); one.setId(2); one.setName("shekar"); jco.update(one); */
	  
	 
	
	//delete operation
	/*
	 * One one = new One(); one.setId(2); jco.delete(one);
	 */
	
	
	
	applicationContext.close();
	}
}
