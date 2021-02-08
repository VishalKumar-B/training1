package com.abstractfactorydesignpattern;

import java.util.Scanner;

public class MainLogic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the name of bank in which you want to take loan");
		String bankName = sc.next();
		System.out.println("enter the type of loan");
		String loanType = sc.next();

		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);

		System.out.println("enter the intrest rate for '" + b.getBankName() + "': ");
		double rate = sc.nextDouble();

		System.out.println("enter amount");
		double loanAmount = sc.nextDouble();

		System.out.println("enter time period in years");
		int years = sc.nextInt();

		AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
		Loan loan = loanFactory.getLoan(loanType);
		loan.getIntrestRate(rate);
		loan.calculateLoanPayment(loanAmount, years);
		
		sc.close();
	}
}
