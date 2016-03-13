package com.AbstractFactoryPattern;

public class LoanFactory extends AbstractBankLoanFactory{

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		if(loan.equalsIgnoreCase("PERSONAL"))return new PersonalLoan();
		return null;
	}

}
