package com.indiafix.lambda;
interface E
{
	int add(int a,int b);
}

public class Examp4 {

	public static void main(String[] args) {
		E obj=(int a,int b)->
		{
			return a+b;
		};
		System.out.println("The addition of a And b is "+obj.add(13, 10));

	}

}
