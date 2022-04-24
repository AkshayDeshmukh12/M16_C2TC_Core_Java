package com.m16;

import java.util.Scanner;

public class Array3 {

	
		 public static void main(String[] args)

		{

		int[] a=new int[5];

		Scanner s=new Scanner(System.in);

		System.out.println("enter values");

		for (int i=0;i<a.length;i++)

		{

		System.out.println("enter "+i+" value");

		a[i]=s.nextInt();

		}

		for (int a1:a)

		{

		System.out.println(a1);

		}

		}

		
	}


