package com.m16.git;


		import java.util.*;

		class Test extends Thread

		{

		public void run()

		{

		System.out.println("Process Error");

		}

		}

		public class Example3
		{
			public static void main(String[] args) {
		

		Test create=new Test();

		create.start();

		create.run();

		create.run();

		}

		}
	


