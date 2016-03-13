package com.DecoratorPattern;

public class TestDecorator {
	public static void main(String[] args) {
		Shape s = new RedShapeDecorator(new Triangle());
		System.out.println(s.draw());
	}
}
