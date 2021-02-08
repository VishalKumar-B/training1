package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Object o = context.getBean("jtobj");
		JdbcSelect js = (JdbcSelect)o; 
		//js.selectRecords();
		
		//insert operation
		/*
		 * One one = new One(); one.setId(3); one.setName("raju");
		 * js.insertRecords(one);
		 */
		
		//update operation
		/*
		 * One one = new One(); one.setName("shekar"); one.setId(3);
		 * js.updateRecords(one);
		 */
		
		//delete operation
		/*
		 * One one = new One(); one.setId(3); js.deleteRecords(one);
		 */
		//select operation using row Mapper interface 
		js.select();
	}

}
