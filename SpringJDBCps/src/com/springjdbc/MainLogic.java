package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Object o = context.getBean("jtobj");
		JdbcPS js = (JdbcPS)o; 
		
		//insert using PreparedStatementCallback
		/*
		 * One one = new One(); one.setId(3); one.setName("raju"); js.insert(one);
		 */
	
		//js.selectPsCallback();
		js.selectPsRowMapper();
	}

}
