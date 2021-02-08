package com.factorymethodpattern;

import java.util.Scanner;

public class MainLogic {

	public static void main(String[] args) {

		CarFactory cf = new CarFactory();

		Scanner sc = new Scanner(System.in);
		String companyName = "";
		System.out.println("enter the car company name to get details");
		companyName = sc.next();

		Car car = cf.getcar(companyName);
		car.model();
		
		sc.close();
	}
}
