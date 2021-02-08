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
		  
		  System.out.println(context.containsBean("pune"));
		  System.out.println(context.containsBeanDefinition("pune"));
		  System.out.println(context.getApplicationName());  //Return a name for the deployed application that this context belongs to.
		  System.out.println(context.getDisplayName());  //Return a friendly name for this context.
		  System.out.println(context.getId());  //Return the unique id of this application context.
		  System.out.println(context.getParent());  //Return the parent context, or null if there is no parent and this is the root of the context hierarchy.
		  
		  Timestamp ts=new Timestamp(System.currentTimeMillis());  
          Date date=new Date(context.getStartupDate());  //Return the time stamp when this context was first loaded.
		  System.out.println(date);  
	}

}
