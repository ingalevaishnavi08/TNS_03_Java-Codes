package com.controlstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
	System.out.println();
	
	//Print Odd Number
	for(int j=1;j<=10;j++)
	{
		if(j%2==0)
		{
			continue;
		}
		System.out.println(j);
	}
	}
}
