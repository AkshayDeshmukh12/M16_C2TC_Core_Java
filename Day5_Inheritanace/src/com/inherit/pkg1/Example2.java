package com.inherit.pkg1;

public class Example2 {
	void color() {
		System.out.println("Based on Green Color");
	}
}
class Flower extends Example2{
	void color1()
	{
		System.out.println("Flower");
	}

	
	
}
class red extends Flower{
	void color2() {
		System.out.println("Red color");
	}

	public static void main(String[] args) {
	red r=new red();
	r.color();
	r.color1();
	r.color2();
	

	}

}
