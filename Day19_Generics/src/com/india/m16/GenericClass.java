package com.india.m16;

public class GenericClass<T> {
	T val;
	void print()
	{
		System.out.println(val.getClass());
	}
	public static void main(String[] args) {
		GenericClass a=new GenericClass<>();
		a.val='q';
		a.print();
		
	}

}
