package com.practice.withpool.singleton;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * reusing an instance from object pool everytime based on Coherent Policy  
 * @author Manish Luste
 *
 */
public class JdbcPoolApplication {

	public static void main(String[] args) {
		JDBCConnectionSingletonPool instance = null;
		
		try { instance = JDBCConnectionSingletonPool.getInstance("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world",
			  "root", "root"); } catch (SQLException e) { e.printStackTrace(); }
		
		// Expensive object : Connection 
	    Connection con1 = null;
		try { con1 = instance.acquireObject(); } catch (Exception e) { System.out.println("JdbcPoolApplication.main() : Error : "+ e.getMessage()); }
			
	    Connection con2 = null;
		try { con2 = instance.acquireObject(); } catch (Exception e) { System.out.println("JdbcPoolApplication.main() : Error : "+ e.getMessage()); }
	    
	    instance.releaseObject(con1);
	    
	    Connection con3 = null;
	    try { con3 = instance.acquireObject(); } catch (Exception e) { System.out.println("JdbcPoolApplication.main() : Error : "+ e.getMessage()); }
	    
	    
	    Connection con4 = null;
	    try { con4 = instance.acquireObject(); } catch (Exception e) { System.out.println("JdbcPoolApplication.main() : Error : "+ e.getMessage()); }
	    
	    instance.releaseObject(con2);
		
	}

}
