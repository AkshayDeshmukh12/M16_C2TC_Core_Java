package com.inherit.pkg1;
 class Green  {
	void color() {
		System.out.println("Based on Green Color");
	}
}
class Flower extends Green{
	void color1()
	{
		System.out.println("Flower");
	}

	
	
}
public class Example2 extends Flower {
	void color2() {
		System.out.println("Red color");
	}

	public static void main(String[] args) {
		Example2 r=new Example2();
	r.color();
	r.color1();
	r.color2();
	

	}

}
