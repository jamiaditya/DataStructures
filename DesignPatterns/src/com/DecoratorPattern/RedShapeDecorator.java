package com.DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator{

	RedShapeDecorator(Shape s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return super.draw()+" With red color pen";
	}
}
