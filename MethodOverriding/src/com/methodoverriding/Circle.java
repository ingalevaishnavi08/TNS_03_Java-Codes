package com.methodoverriding;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw()
	{
	System.out.println("Drawing circle with radius "+radius);	
	}
	@Override
	public void erase()
	{
	System.out.println("Erasing circle with radius "+radius);	
	}
}
