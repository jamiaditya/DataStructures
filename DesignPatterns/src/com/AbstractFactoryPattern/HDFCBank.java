package com.AbstractFactoryPattern;

public class HDFCBank implements Bank {
	private final String bankName;
	public HDFCBank() {
		// TODO Auto-generated constructor stub
		bankName = "HDFC";
	}
	@Override
	public void getBankName() {
		// TODO Auto-generated method stub
		System.out.println(bankName+" Bank");
	}

}
