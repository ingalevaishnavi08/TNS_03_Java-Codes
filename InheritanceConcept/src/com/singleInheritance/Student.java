package com.singleInheritance;


public class Student extends Citizen{
 private int age;
 private String department;
 
 public Student() {
	super();
 }
 
 public Student(String name, long aadharno, String address, long phoneno, int age, String department  ) {
	super(name, aadharno, address, phoneno);
	   this.age = age;
       this.department = department;
 }
 public int getAge() {
	return age;
 }
 public void setAge(int age) {
	this.age = age;
 }
 public String getDepartment() {
	return department;
 }
 public void setDepartment(String department) {
	this.department = department;
 }
 
 @Override
 public String toString() {
	return "Student [age=" + age + ", department=" + department + ", toString()=" + super.toString() + "]";
 }
 
 
}
