package com.m16.pkg;

import java.util.StringTokenizer;

public class Example7 {

	

		

		public static void main(String args[]){

		StringTokenizer st = new
		StringTokenizer("Let,s,try,this",",");

		while (st.hasMoreTokens()) {

		System.out.println(st.nextToken());

		}

		}

		

}
