package com.m16.pkg;
import java.util.*;
public class Exam7 {


		public static void main(String args[])

		{

		LinkedList<String> list = new LinkedList<String>();

		list.add("Jio");

		list.add("Airtel");

		list.add("BSNL");

		list.add("Vodafone");

		System.out.println(list);

		Iterator<String> it =
		list.descendingIterator();

		while (it.hasNext())

		{

		System.out.println(it.next());

		}

		
	}

}
