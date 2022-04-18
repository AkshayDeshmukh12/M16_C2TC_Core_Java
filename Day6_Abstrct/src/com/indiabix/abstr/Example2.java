package com.indiabix.abstr;

class Bike{
	final void display() {
		System.out.println("Bike Speed is 180");
	}
}


public class Example2 extends Bike {
	void run() {
		System.out.println("Bike rider");
	}

	public static void main(String[] args) {
		Example2 e=new Example2();
		e.display();
		e.run();

	}

}
