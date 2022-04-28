package com.m16.git;
import java.lang.Thread;
public class Example1 {

	public static void main(String[] args) {
		
		

		Thread t = Thread.currentThread();

		System.out.println("Current Thread :" + t);

		try

		{

		Thread.sleep(1);

		}

		catch (InterruptedException e)

		{

		System.out.println("Main Thread Interrupted");

		}

		
	}

}
