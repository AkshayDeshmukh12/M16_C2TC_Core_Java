package com.m16;

public abstract class Fruit {
	public abstract void test(); // it's an abstract method without method body
	public void color() // Concrete method having body 
	{
		System.out.println("Color of Fruit is Not Important ");
	}
	
	
// fruit class end 

class Mango extends Fruit 
{
	public void test() //providing implementation body to AM
	{
		System.out.println("Mango Test is Very Sweet");
	}
	public void color()
	{
		System.out.println("Mango Color is Yellow");
	}
	
}

class Lemon extends Fruit
{
	public void test() //providing implementation body to AM
	{
		System.out.println("Lemon test is citrus ");
	}
// lemon class end

}
 public class AbstractClassExample {
	public void main(String[] args) {
		
	//Fruit f= new Fruit(); here , we can't create object for Abstract Class
		
		Fruit f= new Mango();
		f.test();
		f.color();
		
		Fruit ff= new Lemon();
		ff.test();
		ff.color();

	}
  }
}









