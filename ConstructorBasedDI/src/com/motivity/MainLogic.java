package com.motivity;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {

		
		/*
		 * Resource res = new ClassPathResource("Spring.xml"); BeanFactory factory = new
		 * XmlBeanFactory(res); Resource res1 = new ClassPathResource("One.xml");
		 * BeanFactory factory1 = new XmlBeanFactory(res1,factory);
		 * 
		 * 
		 * Object o = factory1.getBean("pune"); Journey j = (Journey) o;
		 * j.startJourney();
		 */
		 
		
		
		  ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Spring.xml","One.xml"}); 
		  //ApplicationContext context1 = new ClassPathXmlApplicationContext("One.xml"); 
		  Object o = context.getBean("pune"); 
		  Journey j = (Journey)o; 
		  j.startJourney();
		  
	}

}
