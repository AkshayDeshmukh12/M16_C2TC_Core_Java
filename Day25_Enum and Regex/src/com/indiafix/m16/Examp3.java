package com.indiafix.m16;

import java.util.Scanner;

public class Examp3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="M-16 @@ Akshay Deshmukh@@Ankita--Nakhate";
		String[] res=str.split("--");
		for(String i:res)
		{
			System.out.println(i);
		}
	}

}
