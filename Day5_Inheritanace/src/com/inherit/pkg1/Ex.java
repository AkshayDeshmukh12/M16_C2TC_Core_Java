package com.inherit.pkg1;

 class Blue {
	void display()
	{
		System.out.println("Welcom TO CT2C");
	}
}
	public class Ex extends Blue
	{
		void pass()
		{
			System.out.println("Its Blue Color");
		}

	
	public static void main(String[] args) {
		
		Ex b=new Ex();
		b.display();
		b.pass();

	}
	

}
