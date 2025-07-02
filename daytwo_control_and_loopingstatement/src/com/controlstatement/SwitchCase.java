package com.controlstatement;

public class SwitchCase {

	public static void main(String[] args) {
		char x='L';
				switch(x)
				{
				case 'd':
				System.out.println("This is contain didgits");
				break;
				case 'l':
				case 'L':
				System.out.println("This is contain letter");	
				break;
				case 'w':
				System.out.println("This is contain whitespace");
				break;
				case 's':
				System.out.println("This is contain symbol");
				break;
				default:
					System.out.println("This is not contain digit,symbol,letter,whitespace");
				break;
				
				}
	}

}
