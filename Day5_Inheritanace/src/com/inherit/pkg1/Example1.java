package com.inherit.pkg1;

public class Example1 {
	void print() {
		System.out.println("Example1");
		}
}
  class E extends Example1
 {
	 void accept() {
		 System.out.println("Example2");
	 }
 }
 class Example3 extends E
 {
	 void display()
	 {
		 System.out.println("Example");	
		 }
 
 
	public static void main(String[] args) {
		Example3 e= new Example3();
		e.accept();
		e.display();
		e.print();

	}

}
