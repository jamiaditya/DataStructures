package com.FactoryMethodPattern;

public abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void calculateRate(int units){
		System.out.println("Rate is "+ units*rate);
	}
}
