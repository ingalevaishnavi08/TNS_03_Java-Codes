package com.methods;

public class MethodsDemo {
	//without parentheses
    public void addition()
    {
    	int a=10;
    	int b=20;
    	int add=a+b;
    	System.out.println("Addition of a and b="+add);
    }
    //with parentheses
    public void multiply(int a,int b)
    {
    	int mul=a*b;
    	System.out.println("Multiplication of a and b="+mul);
    }
	public static void main(String[] args) {
	MethodsDemo obj1=new MethodsDemo();
	obj1.addition();
	obj1.multiply(10,8);
	}

}
