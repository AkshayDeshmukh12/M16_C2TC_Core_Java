package com.india.m16;

import java.util.ArrayList;
import java.util.Iterator;

public class Examp3 {

	public static void main(String[] args) {
		ArrayList<String>as=new ArrayList<String>();
		as.add("Amol");
		as.add("Akshay");
		String res=as.get(1);
		System.out.println(res);
		Iterator<String>i=as.iterator();
		while(i.hasNext())
		{
			System.out.println(i.hasNext());
		}
	}

}
