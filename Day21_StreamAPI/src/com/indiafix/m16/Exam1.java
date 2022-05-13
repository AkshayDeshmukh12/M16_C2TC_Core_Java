package com.indiafix.m16;
import java.util.List;
import java.util.Arrays;

public class Exam1 {

	public static void main(String[] args) {
		List<Integer>obj= Arrays.asList(10,40,6,5,30,12,17,6);
		obj.stream().distinct().forEach(System.out::println);
		System.out.println("Distinct Output:");
		obj.stream().limit(6).forEach(System.out::println);
		System.out.println("Skip Output:");
		obj.stream().skip(1).forEach(System.out::println);
		System.out.println("Sorting Output:");
		obj.stream().sorted().forEach(System.out::println);
		
		
		
		
	}

}
