package com.springjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringJDBCConfiguration.class);
	Object o = applicationContext.getBean(JdbcCrudOperatios.class);
	JdbcCrudOperatios jco = (JdbcCrudOperatios)o; 
	
	//select operation
	//jco.select();
	
	//insert operation
	/*
	 * One one = new One(); one.setId(3); one.setName("raju"); jco.insert(one);
	 */
	
	//update operation
	/*
	 * One one = new One(); one.setId(3); one.setName("shekar"); jco.update(one);
	 * 
	 */
	
	//delete operation
	One one = new One();
	one.setId(3);
	jco.delete(one);
	
	
	
	applicationContext.close();
	}
}
