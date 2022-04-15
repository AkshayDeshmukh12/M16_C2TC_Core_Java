package com.inherit.pkg1;

public class Example3 {
	void display()
	{
		System.out.println("Welcom TO CT2C");
	}
}
 class Blue extends Example3
{
	void pass()
	{
		System.out.println("Its Blue Color");
	}

	public static void main(String[] args) {
		Blue b=new Blue();
		b.pass();
		b.display();

	}

}
