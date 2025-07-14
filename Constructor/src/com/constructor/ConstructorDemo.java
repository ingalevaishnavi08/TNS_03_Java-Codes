package com.constructor;
import java.util.Scanner;

	class Student {
	    // Private fields (Encapsulation)
	    private String name;
	    private int age;

	    // Constructor
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Setter for age
	    public void setAge(int age) {
	        this.age = age;
	    }
	}

	public class ConstructorDemo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking user input
	        System.out.print("Enter student's name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter student's age: ");
	        int age = scanner.nextInt();

	        // Creating object using constructor
	        Student student = new Student(name, age);


	        // Display details
	        System.out.println(" \n Student Details:");
	        System.out.println("Name: " + student.getName());
	        System.out.println("Age: " + student.getAge());

	        scanner.close();
	    }
	
}
