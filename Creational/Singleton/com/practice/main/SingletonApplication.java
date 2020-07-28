package com.practice.main;

import com.practice.singleton.CoFounder;

/**
 * Singleton Design Pattern:
 * Provide a class that create a shared global instance for all other object whose try to operate the same like Database, File, Configuration..etc
 * It create an instance only once in main memory(volatile) and then accessing from cache every time
 * Its not a thread-safe because multiple thread may have different instance to break singleton purpose and its create a issue while accessing from cache
 * So, perform costly operation via volatile class instance to grant the same access for all the object in multi-threading environment(make thread-safe)
 * At the end Its easy but much costly so used when must provide visibility of variable by making volatile instance  and private constructor
 * 
 * @author Manish Luste
 *
 */
public class SingletonApplication {

	public static void main(String[] args) {
		
		
		Thread th1 = new Thread(() ->   {
			CoFounder cfo = CoFounder.getInstance("Manish Luste");
			System.out.println("SingletonApplication.main() : Thread 1 from CPU => Created instance for: "+cfo.cfoName);
		});
		
		Thread th2 = new Thread(() ->   {
			CoFounder cfo = CoFounder.getInstance("Techies");
			System.out.println("SingletonApplication.main() : Thread 2 from CPU => Created instance for: "+cfo.cfoName);
		});
		
		System.out.println("After object creation there is 2 case to check singlton object :"
				+ "\n\t 1. if both the thread's value is same = Right for multithreading environment too"
				+ "\n\t 2. if both the thread's value is different = Wrong for multithreading environment");
		
		th1.start();
		th2.start();
		
		// Optional : just to destroy app and check new co-founder every time
		//System.gc();
	}

}
