package com.AbstractFactoryPattern;

public abstract class AbstractBankLoanFactory {
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
}
