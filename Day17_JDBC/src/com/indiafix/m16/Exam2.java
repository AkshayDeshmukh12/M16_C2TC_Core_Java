package com.indiafix.m16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Exam2 {

	public static void main(String[] args)throws SQLException {
		

		
				//for JSP  File, use below link also to create a dynamic project(optional)
				//https://beginnersbook.com/2017/06/how-to-fix-dynamic-web-project-missing-in-eclipse-issue/
				
				//for dbDriver,we need a jar file//search on google -mySQL j connector for java -download as platform independent
				String dbDriver="com.mysql.cj.jdbc.Driver";
				
				String dbURL="jdbc:mysql://127.0.0.1:3306/Capgemini"; //(Mysql (tab)- database-manage connection
				 //where Capgemini is the DB name in mYSQL server
				 String dbUsername="root";
				 String dbPassword="Akshay@123";
				 String query="select * from EnggStudent";// where EnggStudent is a table name of mySQL
				 try 
				 {
					 Class.forName(dbDriver);
				 }
				 catch(ClassNotFoundException e)
				 {
					 e.printStackTrace();
					 
				 }
				 try
				 {
					 Connection con=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
					 Statement st=con.createStatement();
					 ResultSet rs=st.executeQuery(query);
					 
					 while(rs.next())
					 {
						 String EmployeesData="";
						 for(int i=1;i<=2;i++)// i belongs to column of SQL table  here
						 {
							 EmployeesData=EmployeesData+" "+rs.getString(i);
							 
						 }
						 System.out.println(EmployeesData);
					 }
					 
				 }
				 catch(SQLException e)
				 {
					 System.out.println("An error occurred. Maybe user/password is invalid");
					 e.printStackTrace();
					 
				 }
				
				 
			 

	}

}
