package com.motivity;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainLogic {

	public void check() {
		System.out.println("---------------------spring boot running-----------------------");
	}

	@Autowired
	JdbcCrudOperations jdbcCrudOperations;

	public void crudOperations() {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		do {
			System.out.println("1.Insert 2.Display 3.Update 4.Delete");
			System.out.println("select any one option");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				jdbcCrudOperations.insert();
				break;
			case 2:
				jdbcCrudOperations.display();
				break;
			case 3:
				jdbcCrudOperations.update();
				break;
			case 4:
				jdbcCrudOperations.delete();
				break;
			}
			System.out.println("do you want to continue Y/N");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));
	}

}
