package com.indiabix.abstr;

  class Base{
	void fun() {
		System.out.println("Base Fun Called");
	}
}
class Derived extends Base{
	
}


public class Example1 {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.fun();

	}

}
