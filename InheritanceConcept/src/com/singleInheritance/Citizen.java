package com.singleInheritance;

public class Citizen {
 private String name;
 private long aadharno;
 private String address;
 private long phoneno;
 
 public Citizen() {
	System.out.println("Generate Citizen");
 }
 public Citizen(String name, long aadharno, String address, long phoneno) {
	super();
	this.name = name;
	this.aadharno = aadharno;
	this.address = address;
	this.phoneno = phoneno;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public long getAadharno() {
	return aadharno;
 }
 public void setAadharno(long aadharno) {
	this.aadharno = aadharno;
 }
 public String getAddress() {
	return address;
 }
 public void setAddress(String address) {
	this.address = address;
 }
 public long getPhoneno() {
	return phoneno;
 }
 public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
 }
 @Override
 public String toString() {
	return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phoneno=" + phoneno + "]";
 }
 
 
}
