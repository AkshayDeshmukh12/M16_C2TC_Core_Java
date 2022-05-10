package com.indiafix.m16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam1 {

	public static void main(String[] args) {
		
				String dbURL = "jdbc:mysql://127.0.0.1:3306/SampleDB";
				String username = "root";
				String password = "Akshay@123";
				 
				try 
				{
				 
				    Connection conn = DriverManager.getConnection(dbURL, username, password);
				 
				    String sql = "INSERT INTO CRUD (username, password, fullname, email) VALUES (?, ?, ?, ?)";
				    
				    PreparedStatement statement = conn.prepareStatement(sql);
				    statement.setString(1, "bill");
				    statement.setString(2, "secretpass");
				    statement.setString(3, "Bill Gates");
				    statement.setString(4, "bill.gates@microsoft.com");
				     
				    int rowsInserted = statement.executeUpdate();
				    if (rowsInserted > 0) {
				        System.out.println("A new user was inserted successfully!");
				    }
				    conn.close();
				    
				}
				catch (SQLException ex) 
				{
				    ex.printStackTrace();
				}
				
			}

		}

	


