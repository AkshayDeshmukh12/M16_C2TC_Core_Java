package com.m16.git;
import java.util.*;
public class Eample4 {

	public static void main(String[] args) {
		
		

		Thread t = Thread.currentThread( );

		System.out.println("Current Thread :" + t);

		t.setName("Void");

		System.out.println("Current thread :" +t);

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
