package com.indiafix.ab;
 
public class Example3 {
	 

	Example3()
	{
		int a=29;
		int b=35;
	}
	Example3 accept()
	{
		return this;
	}
	void print(int a, int b)
	{
		
		
		System.out.println("value of a is:"+a);
		
		System.out.println("value of b is:"+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 e=new Example3();
		e.accept();
		e.print(54,91);
		
	}

}
