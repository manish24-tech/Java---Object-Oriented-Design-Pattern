package com.practice.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBC Connection pool : responsible to initialize and destroy object to/from pool  
 * 
 * @author Manish Luste
 *
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {

	private String dsn, usr, pwd;

	public JDBCConnectionPool() {
		super();
	}

	public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
		super();
		try { Class.forName(driver).newInstance();} catch (Exception e) { e.printStackTrace();}
		this.dsn = dsn;
		this.usr = usr;
		this.pwd = pwd;
	}

	@Override
	public void setObjectPoolSize(int objectPoolSize) {
		super.setObjectPoolSize(objectPoolSize);
	}

	@Override
	public Connection init() {
		try {
			return DriverManager.getConnection(dsn, usr, pwd);
		} catch (SQLException e) { e.printStackTrace(); 
			return (null);
		}
	}

	@Override
	public void destroy(Connection object) {
		try { object.close(); } catch (SQLException e) { e.printStackTrace();}
		
	}

}
