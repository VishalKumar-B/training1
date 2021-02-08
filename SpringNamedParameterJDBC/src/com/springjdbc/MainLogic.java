package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Object o = context.getBean("npjdbcobj");
		JdbcNP np = (JdbcNP)o; 
		
		//insert operation 
		/*
		 * One one = new One(); one.setId(3); one.setName("raju"); np.insert(one);
		 */
		
		//np.select();
		
		//update operation
		One one = new One();
		one.setId(3);
		one.setName("shekar");
		np.update(one);
		
		
	}

}
