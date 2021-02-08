package com.abstractfactorydesignpattern;

public class BusinessLoan extends Loan{

	@Override
	void getIntrestRate(double rate) {
		this.rate=rate;
	}

}
