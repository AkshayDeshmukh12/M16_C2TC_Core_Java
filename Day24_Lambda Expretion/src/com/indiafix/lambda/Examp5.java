package com.indiafix.lambda;

import java.util.LinkedList;

public class Examp5 {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(56);
		obj.add(23);
		obj.add(89);
		System.out.println(obj);
		obj.forEach((n)->
		{
			System.out.println(n);
		});
	}

}
