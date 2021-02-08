package com.abstractfactorydesignpattern;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		
		if(bank==null)
			return null;
		if(bank.equalsIgnoreCase("SBI"))
			return new SBI();
		if(bank.equalsIgnoreCase("IDBI"))
			return new IDBI();
		if(bank.equalsIgnoreCase("UnionBank"))
			return new UnionBank();
		
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
