package com.practice.withpool.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Singleton class as object pool 
 * contain private constructor to initialize at once
 * acquireObject and released object based on Coherent Policy
 *  
 * @author Manish Luste
 *
 */
public class JDBCConnectionSingletonPool {
	
	// managing reusable object based on acquire and release process 
	private static Set<Connection> available = new HashSet<>();
	private static Set<Connection> inUse = new HashSet<>();

	// object pool size with set-get
	private static int objectPoolSize = 2;

	// connections detail
	private String dsn,usr,pwd;

	private JDBCConnectionSingletonPool(String driver, String dsn, String usr, String pwd) {
		super();
		try { Class.forName(driver).newInstance(); } catch (Exception e) { e.printStackTrace(); }
		this.dsn = dsn;
		this.usr = usr;
		this.pwd = pwd;
	}
	
	
	public synchronized Connection acquireObject() throws Exception {
		try { Thread.sleep(1000); } catch(InterruptedException e) { Thread.currentThread().interrupt();}
		
		if(objectPoolSize > 0) {
			//System.out.println("JDBCConnectionSingletonPool.acquireObject() : Before Pool Size => "+objectPoolSize);
			objectPoolSize = objectPoolSize - 1;
			//System.out.println("JDBCConnectionSingletonPool.acquireObject() : After Pool Size => "+objectPoolSize);
			Connection reusableInstance = available.iterator().next();
			available.remove(reusableInstance);
		    inUse.add(reusableInstance);
			
		    return reusableInstance;
			
		} else {
			throw new Exception("The internal connection pool has reached its maximum size and no connection is currently available");
		}
	}
	
	public synchronized void releaseObject(Connection object) {
		try { Thread.sleep(1000); } catch(InterruptedException e) { Thread.currentThread().interrupt();}
		
		inUse.remove(object);
		available.add(object);
		//System.out.println("JDBCConnectionSingletonPool.releaseObject() : Before Pool Size => "+objectPoolSize);
		objectPoolSize = objectPoolSize + 1;
		//System.out.println("JDBCConnectionSingletonPool.releaseObject() : Before Pool Size => "+objectPoolSize);
	}
	
	
	public static JDBCConnectionSingletonPool getInstance(String driver, String dsn, String usr, String pwd) throws SQLException {
		
		JDBCConnectionSingletonPool jdbcConnectionSingletonPool = new JDBCConnectionSingletonPool(driver, dsn, usr, pwd);
		
		// create an instace at start based on pool size
		if(available.isEmpty()) {
			
			for(int i=1; i<=objectPoolSize; i++) {
				available.add(DriverManager.getConnection(dsn, usr, pwd));  
			}
			
			available.forEach(System.out::println);
		}
		
		return jdbcConnectionSingletonPool;
	}
	
}
