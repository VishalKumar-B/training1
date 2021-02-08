package com.abstractfactorydesignpattern;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		
		if(loan == null)
			return null;
		if(loan.equalsIgnoreCase("Home"))
			return new HomeLoan();
		if(loan.equalsIgnoreCase("Business"))
			return new BusinessLoan();
		if(loan.equalsIgnoreCase("Education"))
			return new EducationLoan();
		
		return null;
	}

}
