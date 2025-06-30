package com.controlstatement;

public class NestedIfElseStatement {

	public static void main(String[] args) {
	int a=10,b=50,c=30;
	if(a>b)
	{
		if(a>c)
		{
				System.out.println("a is greater number");
		}
		else
		{
			System.out.println("c is greater number");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("b is greater number");
		}
		else
		{
			System.out.println("c is greater number");
		}
	}

	}

}
