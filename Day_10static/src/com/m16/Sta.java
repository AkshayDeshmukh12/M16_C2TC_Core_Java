package com.m16;
final class Vehicle
{
	public void vehicleRule()
	{
		System.out.println(" Driving Vehicle Having rule and Guidelines ");
	}
}


class Car
{
	public final int speed=90;   

	// speed=70;        
	public final void engine() 
	{
		System.out.println("This Car Having 570 CC Engine");
	}

}

class Maruti extends Car
{
	/*
	 * we will get error here because we can not override 
	 * final method into subclass 
	public void engine()
	{
		System.out.println("Maruti Car Having 550 CC Engine");
	} 
	*/
}

public class Sta {

	public static void main(String[] args) {
		

		// Creating object 
		Car c= new Maruti();
		c.engine();
		System.out.println("Final Speed For " +c.speed);

	}

}

