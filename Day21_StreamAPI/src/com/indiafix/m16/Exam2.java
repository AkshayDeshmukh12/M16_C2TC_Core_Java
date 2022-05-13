package com.indiafix.m16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam2 {

	public static void main(String[] args) {
		List<Integer>ab=Arrays.asList(40,50,6,30,12,17,6);
		List<Integer>ac=ab.stream().map(i->i).collect(Collectors.toList());
		System.out.println(ab);
	}

}
