package com.AbstractFactoryPattern;

public abstract class Loan {
	protected double rate;
	public abstract void getInterestRate(double rate);
	public void canculateLoanAmount(double principle, int tenure){
		System.out.println("Total Loan Amount is "+principle*tenure*rate);
	}
}
