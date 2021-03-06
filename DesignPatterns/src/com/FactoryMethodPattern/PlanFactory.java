package com.FactoryMethodPattern;

public class PlanFactory {
	public Plan plan;
	
	public Plan getPlan(String planType){
		if(planType == null)return null;
		if(planType.equalsIgnoreCase("DOM"))return new DomesticPlan();
		else if(planType.equalsIgnoreCase("COM"))return new CommercialPlan();
		else if(planType.equalsIgnoreCase("INS")) return new InstitutionalPlan();
		return null;
	}
}
