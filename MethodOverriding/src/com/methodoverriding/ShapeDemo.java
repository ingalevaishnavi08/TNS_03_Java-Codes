package com.methodoverriding;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Circle c=new Circle(5.0);
		Square s=new Square(4.0);
		
		c.draw();
		c.erase();
		
		s.draw();
		s.erase();
	}

}
