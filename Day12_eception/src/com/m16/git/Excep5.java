package com.m16.git;


		import java.util.ArrayList;

		import java.util.Collections;

		import java.util.List;

		class ListTooLargeException extends RuntimeException

		{

		ListTooLargeException(String message)

		{

		super(message);

		}

		}

		public class Excep5

		{

		public void analyze(List<String> data)

		{

		if (data.size() > 50)

		{

		throw new ListTooLargeException("List can'texceed 50 items!");

		}

		}



		public static void main(String[] args) {

			Excep5 obj = new Excep5();

		List<String> data = new
		ArrayList<>(Collections.nCopies(100,
		"Customer Details"));

		obj.analyze(data);

		
	}

}
