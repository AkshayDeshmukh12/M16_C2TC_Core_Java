package com.indiafix.ab;

public class Example2 {

	
	void accept(Example2 obj)
	{
		System.out.println("Welcome to C2TC program");
	}
	void print()
	{
		accept(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e=new Example2();
		e.print();
	}

}
