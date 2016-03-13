package com.AbstractFactoryPattern;

public class BankFactory extends AbstractBankLoanFactory{
	public Bank bank;

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		if(bank.equalsIgnoreCase("HDFC"))return new HDFCBank();
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
