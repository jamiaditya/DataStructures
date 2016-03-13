package com.DecoratorPattern;

public class ShapeDecorator implements Shape{
	Shape shape;
	
	ShapeDecorator(Shape s){
		shape = s;
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return shape.draw();
	}
	
	
}
