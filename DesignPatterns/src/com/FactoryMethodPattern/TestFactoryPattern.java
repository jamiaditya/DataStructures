package com.FactoryMethodPattern;

public class TestFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlanFactory f = new PlanFactory();
		Plan p = f.getPlan("DOM");
		p.getRate();
		p.calculateRate(10);
	}

}
