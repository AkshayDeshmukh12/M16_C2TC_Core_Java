package com.indiabix.abstr;


class Parent
{
	void accept()
	{
		System.out.println("parent");
	}
}
class Child extends Parent
{
	void accept() {
		System.out.println("color");
	}
	void display()
	{
		accept();
		super.accept();
	}
		
	
	
		
	}




public class Example5 {

	public static void main(String[] args) {
		Child c=new Child();
		c.accept();
		c.display();
		
		
	}

}
