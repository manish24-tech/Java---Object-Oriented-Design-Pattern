package com.practice.withoutpool.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * Multi-threading environment : 
 * Thread 1 create new global instance to perform a job
 * Thread 2 use existing instance to perform a job
 * 
 * Note: destroy an instance after n-1 thread otherwise it create new instance every time
 *  
 * @author Manish Luste
 *
 */
public class SingletonObjectPoolApplication {

	public static void main(String[] args) {

		
		Thread connectionPool1 = new Thread(() ->   {
			
			Connection instance = JDBCConnectionSingleton.getInstance("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world",
	      "root", "root");
			System.out.println("Thread 1 CALL");
			
			 Statement stmt = null;
				try {
					stmt = instance.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM `city` WHERE `CountryCode` LIKE 'IDN'");
		
					while(rs.next())
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
				}
		});
		
		
		Thread connectionPool2 = new Thread(() ->   {
			try { Thread.sleep(1000); } catch (InterruptedException e) {e.printStackTrace();}
			Connection instance = JDBCConnectionSingleton.getInstance("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world",
	      "root", "root");
			System.out.println("Thread 2 CALL");
			
			 Statement stmt = null;
				try {
					stmt = instance.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM `city` WHERE `CountryCode` LIKE 'AFG'");
								
					while(rs.next())
						System.out.println(rs.getInt(1)+"  "+rs.getString(2));
					
						
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					System.out.println("Thread 2 == close statement and connection");
					try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
					JDBCConnectionSingleton.closeInstance(instance);
				}
		});
		
		connectionPool1.start(); // create instance for task 1
		connectionPool2.start(); // use existing instance for task 2 and close the instance
		
	}

}
