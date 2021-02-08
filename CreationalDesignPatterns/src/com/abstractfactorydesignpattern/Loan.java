package com.abstractfactorydesignpattern;

import java.text.DecimalFormat;

abstract class Loan {

	protected double rate;

	abstract void getIntrestRate(double rate);

	public void calculateLoanPayment(double loanamount, int years) {

		double EMI,emi;
		int n;
		n = years * 12;
		rate = rate / 1200;
		EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount;
		emi = Double.parseDouble(new DecimalFormat("##.##").format(EMI));
		System.out.println("your monthly EMI is " + emi + " for the amount " + loanamount + "");
	}
}