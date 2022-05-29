package com.indiafix.lambda;
interface A
{
	void show();
}
class B implements A
{
	public void show()
	{
		System.out.println("Functional Interface");
	}
}


public class Examp1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.show();

	}

}
