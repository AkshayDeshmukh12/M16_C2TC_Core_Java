package com.m16.git;


		import java.util.*;

		class Test extends Thread

		{

		public void run()

		{

		System.out.println("thread is running...");

		}

		}

		public class Example2 {

			public static void main(String[] args) {
		{

		Test create=new Test(); //Object creation

		create.start();

		}

		}

	}


