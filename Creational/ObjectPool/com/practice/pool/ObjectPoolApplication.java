package com.practice.pool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Object pool is a collection of reusable objects as per maximum pool size that restrict client to initializing and destroying instance on demand but it will reuse available instance from object pool based on Coherent Policy.
 * <b>Coherent Policy:</b> managing an object as per pool size instead of initialize new or destroy existing
 * Create singleton class with private constructor |OR| abstract class with synchronous method to manage reusable object by sharing  them with client request
 * 
 * Singleton Vs. Object pool  [java.sql.Connection]:
 * singleton create single global instance and shared with  multiple client asynchronously 
 * once object is destroy then it will re-initiate an object
 * should destroy an object when all thread has done their job - means when last instance had done job after first and middle instance then and then destroy. if destroyed from middle instance then last instance become null
 * 
 * While
 * 
 * object pool create instances as per pool size and share with multiple client instead of initialize and destroy
 * one of the instance is destroyed then it will not create another instance 
 * should not destroy any of instance and maintain Coherent Policy
 *  
 * @author Manish Luste
 *
 */
public class ObjectPoolApplication {

	public static void main(String[] args) throws SQLException {
		
		// Create the ConnectionPool:
	    JDBCConnectionPool pool = new JDBCConnectionPool(
	      "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world",
	      "root", "root");
	    pool.setObjectPoolSize(2);
	    
	    // Acquire expensive object instance1 
	    Connection con1 = null;
		try { con1 = pool.acquireObject(); } catch (Exception e) { System.out.println("ObjectPoolApplication.main() : Error : "+ e.getMessage()); }
		
		 // Acquire Expensive object instance2
	    Connection con2 = null;
		try { con2 = pool.acquireObject(); } catch (Exception e) { System.out.println("ObjectPoolApplication.main() : Error : "+ e.getMessage()); }
	    
		 // Release expensive object instance1
	    pool.releaseObject(con1);
	    
	    // Acquire Expensive object instance3 which will have reference of instance1 because it already release
	    Connection con3 = null;
	    try { con3 = pool.acquireObject(); } catch (Exception e) { System.out.println("ObjectPoolApplication.main() : Error : "+ e.getMessage()); }
	    
	    // Acquire Expensive object instance4 which throw an exception of pool size exists because 2 objects has already occupied 
	    Connection con4 = null;
	    try { con4 = pool.acquireObject(); } catch (Exception e) { System.out.println("ObjectPoolApplication.main() : Error : "+ e.getMessage()); }
	    
	    // Release expensive object instance2
	    pool.releaseObject(con2);
	    
	  
	    /*  Statement stmt = null;
		try {
			stmt = con1.createStatement();
			ResultSet rs = stmt.executeQuery("select * from city");
			
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close();
			pool.releaseObject(con1);
		}  */
		
	}

}
