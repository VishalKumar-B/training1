package com.abstractfactorydesignpattern;

public class HomeLoan extends Loan{

	@Override
	void getIntrestRate(double rate) {
		this.rate = rate;
	}

}
