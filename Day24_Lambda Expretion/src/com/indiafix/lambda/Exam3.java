package com.indiafix.lambda;
interface D
{
	String display(String str);
}
public class Exam3 {

	public static void main(String[] args) {
		D obj=(String str)->
		{
			
			System.out.println(("Lambda Expression with Single Parameter"));
			return str;
			
		};

	}

}
