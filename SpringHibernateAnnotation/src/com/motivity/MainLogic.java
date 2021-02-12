package com.motivity;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringHibernateConfiguration.class);
	Object o = applicationContext.getBean(HibernateCrudOperations.class);
	HibernateCrudOperations hco = (HibernateCrudOperations) o;
	
	//insert operation
	
	  Student s = new Student(); s.setId(2); s.setName("kumar"); s.setMarks(535);
	  Object obj = hco.insert(s); if(obj!=null) System.out.println("inserted");
	 
	
	//select operation
	/*
	 * List<Student> list = hco.select(); for(Student s : list) {
	 * System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()); }
	 */
	
	
	//update operation
	/*Student s = new Student();
	s.setId(1);
	s.setMarks(550);
	int i = hco.update(s);
	if(i>0) 
		System.out.println("updated");
	*/
	
	//delete operation
	/*
	 * Student s = new Student(); s.setId(1); int i = hco.delete(s); if(i>0)
	 * System.out.println("deleted");
	 */
	  
	  applicationContext.close();
	}
}
