package com.practice.singleton;

/**
 * "Organization have single co-founder"
 * Its immutable class applicable for multithreading environment too
 * provide single instance and multiple thread always operate single instance everytime 
 * @author Manish Luste
 *
 */
public class CoFounder {

	// create/read instance in/from main memory to solve multi-threading environment 
	private static volatile CoFounder instance;
	
	public String cfoName;
	
	// private constructor to create an object once only
	private CoFounder(String cfoName) {
		this.cfoName = cfoName;
	}
	
	public static CoFounder getInstance(String cfoName) {
		
		CoFounder getInstance = instance;
		
		// reading from cache which but with same instance reference from main memory
		if(getInstance != null) {
			return getInstance;
		}
		
		// creating new instance in main memory if not instantiate earlier compatible with multi-threading
		synchronized (CoFounder.class) {
			if (instance  == null) {
				System.out.println("CoFounder.getInstance() with Co-Founder => "+cfoName);
				instance = new CoFounder(cfoName);
			}
			return instance;
		}
	}

}
