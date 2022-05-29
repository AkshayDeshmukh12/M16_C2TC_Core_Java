package com.indiafix.lambda;
interface C
{
	void show();
	
}
/*class c implements B
{
	public void show()
	{
		System.out.println("Functional Interface");
	}
}*/
public class Exam2 {

	public static void main(String[] args) {
		C obj=()->
		{
			System.out.println("Function Interface");
		};
		obj.show();

	}

}
