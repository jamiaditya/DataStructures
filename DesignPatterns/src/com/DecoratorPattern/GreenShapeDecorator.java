package com.DecoratorPattern;

public class GreenShapeDecorator extends ShapeDecorator{

	GreenShapeDecorator(Shape s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public
	String draw() {
		// TODO Auto-generated method stub
		return super.draw() +" With Green pen";
	}
}	
