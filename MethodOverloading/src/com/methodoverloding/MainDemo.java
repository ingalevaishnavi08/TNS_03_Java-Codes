package com.methodoverloding;

public class MainDemo {
	public static void main (String [] args)
	{
		System.out.println("Is 121 palindrome? "+ Operation.isPalindrome(121));
		System.out.println("Is 123 palindrome? "+ Operation.isPalindrome(123));

		System.out.println("Is CAR palindrome? "+ Operation.isPalindrome("CAR"));
		System.out.println("Is racecar palindrome? "+ Operation.isPalindrome("racecar"));

	}

}
