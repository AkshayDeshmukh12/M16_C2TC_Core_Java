package com.indiafix.m16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



		public class CrudDb {

			public static void main(String[] args)throws SQLException
			{
				String dbURL = "jdbc:mysql://127.0.0.1:3306/SampleDB";
				String username = "root";
				String password = "Akshay@123";
				 
				try 
				{
				 
				    Connection conn = DriverManager.getConnection(dbURL, username, password);
				 
				    String sql = "UPDATE CRUD SET password=?, fullname=? WHERE username=?";
				    
				    PreparedStatement statement = conn.prepareStatement(sql);
				    statement.setString(1, "pass123");
				    statement.setString(2, "William Henry Bill Gates");
				    statement.setString(3, "bill");
				    
				     
				    int rowsUpdated = statement.executeUpdate();
				    if (rowsUpdated > 0) {
				        System.out.println("An existing user was updated successfully!");
				    }
				    conn.close();
				    
				}
				catch (SQLException ex) 
				{
				    ex.printStackTrace();
				}
			
	}

}
