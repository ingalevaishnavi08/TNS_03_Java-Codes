package com.assignments;

public class BloodDonation {

	public static void main(String[] args) {
		int age =22;
		int weight =55;
		if(age>18 && age<65 && weight<=55)
		{
			System.out.println("Person is eligible for blood donation");
		}
		else
		{
			System.out.println("Person is not eligible for blood donation");
		}

	}

}
