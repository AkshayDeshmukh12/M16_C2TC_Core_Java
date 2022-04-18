package com.indiabix.abstr;

class Fruit{
	String name="Apple";
}

class Banana extends Fruit
{
	String name="Orange";
	void print()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class Example4 {

	public static void main(String[] args) {
		Banana b=new Banana();
		b.print();

	}

}
