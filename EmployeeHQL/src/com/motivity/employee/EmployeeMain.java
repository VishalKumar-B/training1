package com.motivity.employee;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int option=0;
		do {
			System.out.println("Select anyone option\n 1. display\n 2. insert\n 3. update\n 4. delete\n 5. exit");
			option=sc.nextInt();
			switch(option) {
			
			case 1:   
				Display.displayOperation();
				break;
			case 2:
				Insert.insertOperation();
				break;
			case 3:
				Update.updateOperation();
				break;
			case 4:
				Delete.deleteOperation();
				break;
			case 5:
				System.out.println("exiting...");
				break;
			default:
				System.out.println("invalid option");
			}
		}while(option < 5 && option > 0);
			System.out.println("exited Successfully");
	}

}
