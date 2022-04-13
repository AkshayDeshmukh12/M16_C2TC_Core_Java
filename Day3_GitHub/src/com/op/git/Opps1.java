package com.op.git;

public class Opps1 {
	
	String name;
	 void Oops1(String name)
	{
	 this.name=name;
	}
	void display()
	{
		System.out.println("This is"+name);
	}

	public static void main(String[] args) {
		Opps1 a=new Opps1();
		Opps1 b=new Opps1();
		Opps1 c=new Opps1();
		Opps1 d=new Opps1();
		a.display();
		b.display();
		c.display();
		d.display();
	}

}
