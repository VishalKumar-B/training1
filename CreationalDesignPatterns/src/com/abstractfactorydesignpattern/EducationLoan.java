package com.abstractfactorydesignpattern;

public class EducationLoan extends Loan{

	@Override
	void getIntrestRate(double rate) {
		this.rate=rate;
	}

}
