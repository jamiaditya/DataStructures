package com.FacadePattern;

public class FacadeImplClass {
	Shape circle;
	Shape triangle;
	
	FacadeImplClass(){
		circle = new Circle();
		triangle = new Triangle();
	}
	
	void drawCircle(){
		circle.draw();
	}
	
	void drawTriangle(){
		triangle.draw();
	}
}
