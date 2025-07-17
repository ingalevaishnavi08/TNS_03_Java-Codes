package com.methodoverriding;

public class Square extends Shape {

private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void draw()
	{
	System.out.println("Drawing circle with radius "+side);	
	}
	@Override
	public void erase()
	{
	System.out.println("Erasing circle with radius "+side);	
	}
}
