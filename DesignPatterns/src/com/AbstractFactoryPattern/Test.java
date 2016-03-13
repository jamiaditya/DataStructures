package com.AbstractFactoryPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractBankLoanFactory f = FactoryCreator.getFactory("BANK");
		Bank b = f.getBank("HDFC");
		b.getBankName();
	}

}
