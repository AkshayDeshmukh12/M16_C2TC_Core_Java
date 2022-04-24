package com.m16;
public class Oc{
	int rollNo; //non-static variable
	String name;   //non-static variable
	String branch;   //non-static variable

	// user defined non-static method
	void display()
	{
		System.out.println("\n ===Students Details===\n ");
		System.out.println("\n Student Roll Number \t:"+getRollNo());   
		System.out.println("\n Student Name  \t:"+getName());      
		System.out.println("\n Student Branch \t:"+getBranch());
	}


	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;

	}
	public void setName(String name) {      
		this.name=name;

	}	
	public void setBranch(String branch) {
			this.branch=branch;

	}	
	public int getRollNo() 
	{                 
		return rollNo;	
	}
	public String getName() {
		return name;

	}
	public String getBranch() {
		return branch;
	}



	public static void main(String[] args) {

		// Student class Object Creation
	  Oc details=new Oc();

		// setting values to variable using setter method
		details.setRollNo(84);                       
		details.setName("Akshay Deshmukh");
		details.setBranch("Computer Application");

		// calling non-static method using object
		details.display();







	}

} 

