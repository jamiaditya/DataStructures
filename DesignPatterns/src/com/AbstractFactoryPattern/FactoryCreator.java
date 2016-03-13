package com.AbstractFactoryPattern;

public class FactoryCreator {
	public static AbstractBankLoanFactory getFactory(String type){
		if(type.equalsIgnoreCase("BANK"))return new BankFactory();
		else if(type.equalsIgnoreCase("LOAN")) return new LoanFactory();
		return null;
	}
}
