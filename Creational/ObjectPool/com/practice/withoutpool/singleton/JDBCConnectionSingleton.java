package com.practice.withoutpool.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Create a shared JDBC-Connection global instance for all other object whose try to operate the same
 * if new client request then initialize 
 * if again new client request then reuse existing 
 * once destroy and new client request then re-initialize\
 *   
 * @author Manish Luste
 *
 */
public class JDBCConnectionSingleton {
	// costly instance applicable to share globally even in multithreading environment 
	private static volatile Connection instance;
	
	// connections detail
	private String dsn;
	private String usr;
	private String pwd;
	
	private JDBCConnectionSingleton(String driver, String dsn, String usr, String pwd) {
		super();
		
		try { Class.forName(driver).newInstance();} catch (Exception e) { e.printStackTrace();}
		
		this.dsn = dsn;
		this.usr = usr;
		this.pwd = pwd;
	}
	
	
	public static Connection getInstance(String driver, String dsn, String usr, String pwd) {
		
		Connection getInstance = instance;
		
		// reading from cache which but with same instance reference from main memory
		if(getInstance != null) {
			System.out.println("JDBCConnectionPool.getInstance() =================== Got instance form cached because it already exists" );
			return getInstance;
		}
		
		// creating new instance in main memory if not instantiate earlier compatible with multi-threading
		synchronized (JDBCConnectionSingleton.class) {
			if (instance  == null) {
				System.out.println("JDBCConnectionPool.getInstance() =================== Created new instance to main because it does not exits" );
				JDBCConnectionSingleton jdbcConnectionPool = new JDBCConnectionSingleton(driver, dsn, usr, pwd);
				try { instance = DriverManager.getConnection(jdbcConnectionPool.dsn, jdbcConnectionPool.usr, jdbcConnectionPool.pwd); } catch (SQLException e1) { e1.printStackTrace();}
			}
			return instance;
		}
	}
	
	public static void closeInstance(Connection instance) {
		try { instance.close(); } catch (SQLException e) { e.printStackTrace();}
	}
}
