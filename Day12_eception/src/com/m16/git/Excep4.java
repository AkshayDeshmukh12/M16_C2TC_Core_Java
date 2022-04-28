package com.m16.git;


		// TODO Auto-generated method stub
		import java.io.*;

		class MyMethod {

		void myMethod(int num)throws IOException,
		ClassNotFoundException{

		if(num==1)

		throw new IOException("IOException Occurred");

		else

		throw new
		ClassNotFoundException("ClassNotFoundException");

		}

		}

		public class Excep4 {

			public static void main(String[] args) {
		try{

		MyMethod obj=new MyMethod();

		obj.myMethod(1);

		}

		catch(Exception ex){

		System.out.println(ex);

		}

		}

		


	}


