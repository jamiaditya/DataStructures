package com.AbstractFactoryPattern;

public class PersonalLoan extends Loan{
	
	@Override
	public void getInterestRate(double r) {
		// TODO Auto-generated method stub
		rate = r;
	}

}
