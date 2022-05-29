package com.indiafix.lambda;

public class Exam7 {

	public static void main(String[] args) {
		Runnable R1=()->
		{
			System.out.println("Multithreding");
		};
		Thread t=new Thread(R1);
		t.start();

	}

}
