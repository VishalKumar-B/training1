package com.motivity;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainLogic {

	public void check() {
		System.out.println("----------------spring boot hibernate is working------------------");
	}
	
	@Autowired
	StudentDao studentDao;
	
	public void crudOperations() {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		do {
			System.out.println("1.Insert 2.Display 3.Update 4.Delete");
			System.out.println("select any one option");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				studentDao.insert();
				break;
			case 2:
				studentDao.display();
				break;
			case 3:
				studentDao.update();
				break;
			case 4:
				studentDao.delete();
				break;
			default:
				System.out.println("invalid option");
			break;
			}
			System.out.println("do you want to continue Y/N");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("exited successfully...");
	}
}
