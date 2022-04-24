package com.mm16;
class Vehicle
{
	public void engine()
	{
		System.out.println("this is normal engine with 80 km/hour speed ");
	}
	public static void  speed()
	{
		System.out.println("Normal Speed For Vehicle");
	}
}

class Bus extends Vehicle
{
	public void engine()
	{
		System.out.println("Bus Engine with 100 km/hour speed");
	}
	public static void  speed()
	{
		System.out.println("Bus  Speed For Volvo ");
	}
}


public class Poly1 {

	public static void main(String[] args) {
		Vehicle v= new Vehicle();   // object creation
		v.engine();;                // calling non-static method using object

		Bus b= new Bus();
		b.engine();


		Vehicle vb= new Bus();
		// this is run time polymorphism, 
	    //this is called as method overriding
		vb.engine();
		// this is compile time polymorphism, 
	    //this is called as method hiding
		vb.speed();
	}

}
