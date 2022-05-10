package com.indiafix.m16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam2 {

	public static void main(String[] args) {
		

		
				String dbURL = "jdbc:mysql://127.0.0.1:3306/SampleDB";
				String username = "root";
				String password = "Akshay@123";
				 
				try 
				{
				 
				    Connection conn = DriverManager.getConnection(dbURL, username, password);
				 
				    String sql = "SELECT * FROM CRUD";
				    
				    Statement statement = conn.createStatement();
				    ResultSet result = statement.executeQuery(sql);
				     
				    int count = 0;
				     
				    while (result.next()){
				        String name = result.getString(2);//2nd index-username//1st index is user_id in mysql
				        String pass = result.getString(3);
				        String fullname = result.getString("Akshay Deshmukh");
				        String email = result.getString("adeshmukh9146@gmail.com");
				     
				        String output = "User #%d: %s - %s - %s - %s";
				        System.out.println(String.format(output, ++count, name, pass, fullname, email));
				    }
				    conn.close();
				    
				}
				catch (SQLException ex) 
				{
				    ex.printStackTrace();
				}

	}

}
