package com.practice.main;

import com.practice.department.IT_Department;
import com.practice.factory.FullStackEngineerFactory;
import com.practice.factory.prototype.IT_DepartmentFactory;
import com.practice.factory.singleton.MinStackEngineerFactory;

/**
 * Abstract Factory : 
 * Provide an interface for group of independent object creation/initialization of same family
 * Used to encapsulate related objects creation and wrap platform(consist of related object) into single abstract unit(Abstract Factory)
 * Lets abstract factory to decide which platform's object should initialized as per family type
 * Client application is an aware about initialization of platform and internal structure
 * Provide re-usability for platform creation (consist of object construction) like welcome new object of particular platform after a while easily without touching business logic 
 * At the end creating a abstract factory that responsible to build core logic/abstraction layer for group of related object construction to use as per need by factory
 *  
 * @author Manish Luste
 *
 */
public class AbstractFactoryApplications {

	public static void main(String[] args) {
		 /*factory creation of group of individual family which client does not know its actual implementation*/
		
		// Full stack : Only Abstract factory method	
		 FullStackEngineerFactory factory = FullStackEngineerFactory.getFactory("javaFullStack");
		 factory.createFrontEnd(2, "Material").getFrontEndDescription();
		 factory.createBackEnd().getBackEndDescription();
		 factory.createDatabase().getDatabseDescription();
		 System.out.println("===============================");
		 
		 // Min stack : combination of abstract factory and singleton == singleton design pattern used in abstract factory method
		  MinStackEngineerFactory factory2 = MinStackEngineerFactory.getFactory("SpringMinStack");
		  factory2.createFrontEnd(1, "IOC & DI").getFrontEndDescription();
		  factory2.createBackEnd().getBackEndDescription();
		  
		  System.out.println("===============================");
		  
		 // IT Department : combination of abstract factory and prototype == prototype design pattern used in abstract factory method
		  IT_DepartmentFactory factory3 = IT_DepartmentFactory.getPrototype("GCP");
		  factory3.createITDepartment(5, "Managing google cloud service for deployment!").getDescription();
		 
		  // IT Department : Cloned object of same type
		 IT_Department type = IT_DepartmentFactory.getType("gcp");
		 type.getDescription();
		   
		  		  
	}

}
