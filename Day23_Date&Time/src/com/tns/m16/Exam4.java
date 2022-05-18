package com.tns.m16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam4 {

	public static void main(String[] args) {
		String s="2022-05-18 1:22";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm");
		LocalDateTime l=LocalDateTime.parse(s,df);
		System.out.println(l);
				
				
	}

}
