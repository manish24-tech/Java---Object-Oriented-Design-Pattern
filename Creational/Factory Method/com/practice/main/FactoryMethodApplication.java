package com.practice.main;

import com.practice.factory.Developer;
import com.practice.factory.DeveloperFactory;

/**
 * Factory Method:
 * Factory == Interface
 * Provide an interface for individual object creation/initialization of different family
 * Used to encapsulate object creation from client and wrap all object initialization into single unit(Factory)
 * Let factory to decide which object should initialize as per given type
 * Client application is an aware about initialization  and internal structure
 * Provide re-usability for object construction like welcome new object after a while easily without touching business logic 
 * At the end creating a factory that responsible to build core logic/abstraction layer for object construction to use as per need by factory 
 * 
 * @author Manish Luste
 *
 */
public class FactoryMethodApplication {
	public static void main(String[] args) {
		
		// factory creation of individual family which client does not know its actual implementation
		DeveloperFactory factory = new DeveloperFactory();
		
		Developer developerInstance1 = factory.getDeveloperInstance("Back-End");
		developerInstance1.getDeveloperByType();
		
		Developer developerInstance2 = factory.getDeveloperInstance("Front-End");
		developerInstance2.getDeveloperByType();
		
		
		Developer developerInstance3 = factory.getDeveloperInstance("UX");
		developerInstance3.getDeveloperByType();
	}

}
