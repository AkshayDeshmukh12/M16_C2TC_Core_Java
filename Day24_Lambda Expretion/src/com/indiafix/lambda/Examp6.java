package com.indiafix.lambda;
interface R
{
	int mul(int a,int b);
}
public class Examp6 {

	public static void main(String[] args) {
		R obj=(int a,int b)->(a*b);
		
		System.out.println("Multipiction of a and b is"+obj.mul(20, 20));

	}

}
