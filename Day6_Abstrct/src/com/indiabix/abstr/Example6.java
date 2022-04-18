package com.indiabix.abstr;


class War
{
	void parent()
	{
		System.out.println("color");
	}
}
class Asc extends War
{
	 void asc()
	{
	 super.parent();
	System.out.println("Akshay");
		
	}
}




public class Example6 {

	public static void main(String[] args) {
		Asc c=new Asc();
		c.parent();
		c.asc();
	}

}
