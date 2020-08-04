package com.practice.pool;

import java.util.HashSet;
import java.util.Set;

/**
 * singleton class = abstract class
 * 
 * Coherent Policy : managing an object as per pool size instead of initialize new or destroy existing
 *  
 * @param <T> : any type of object
 * 
 * @author Manish Luste
 */
public abstract class ObjectPool<T> {
	
	// managing reusable object based on acquire and release process 
	 private Set<T> available = new HashSet<>();
	 private Set<T> inUse = new HashSet<>();
	  
	// object pool size with set-get
	private int objectPoolSize;
	public int getObjectPoolSize() {
		return objectPoolSize;
	}
	public void setObjectPoolSize(int objectPoolSize) {
		this.objectPoolSize = objectPoolSize;
	}

	public abstract T init(); // open object
	public abstract void destroy(T object); // close object - but avoid it
	
	// get an object from pool based on size : stored in use and remove from available
	public synchronized T acquireObject() throws Exception {
		try { Thread.sleep(1000); } catch(InterruptedException e) { Thread.currentThread().interrupt();}
			
			if(this.getObjectPoolSize() > 0) {
				
				this.setObjectPoolSize(objectPoolSize-1);
				
				available.add(init());
				T instance = available.iterator().next();
			    available.remove(instance);
			    inUse.add(instance);
				return instance;
				
			} else {
				throw new Exception("The internal connection pool has reached its maximum size and no connection is currently available");
			}
	}
	
	// release the object : remove from inuse and stored in available for re-usability
	public synchronized void releaseObject(T object) {
		try { Thread.sleep(1000); } catch(InterruptedException e) { Thread.currentThread().interrupt();}
		inUse.remove(object);
		this.destroy(object);
		this.setObjectPoolSize(objectPoolSize+1);
	}
}

