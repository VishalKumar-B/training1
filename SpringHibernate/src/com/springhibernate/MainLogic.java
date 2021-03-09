package com.springhibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Object o = applicationContext.getBean("htobj");
		CRUDoperations crud = (CRUDoperations) o;

		// insert operation
		
//		  Student s = new Student(); s.setId(4); s.setName("v"); s.setMarks(578);
//		  Object obj = crud.insert(s); if(obj!=null) System.out.println("inserted");
//		  else System.out.println("failed");
		 

		// update operation
		
//		  Student s = new Student(); s.setId(3); s.setMarks(150); int i =
//		  crud.update(s); if(i>0) System.out.println("updated");
		
		
		// delete operation
		
//		  Student s = new Student(); s.setId(4); int i = crud.delete(s); if(i>0)
//		  System.out.println("deleted");
		 

		// select operation
		List<Student> list = crud.select();
		for (Student s : list) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks());
		}
	}

}
