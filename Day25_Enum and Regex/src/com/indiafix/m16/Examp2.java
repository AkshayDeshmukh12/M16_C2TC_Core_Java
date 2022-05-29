package com.indiafix.m16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examp2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("Programming");
		Matcher m=p.matcher("Java Programming is enough to got a job in IT Industry");
		while(m.find())
		{
			System.out.printf("Pattern found From :",m.start()+"to"+(m.end()-1));
		}

	}

}
