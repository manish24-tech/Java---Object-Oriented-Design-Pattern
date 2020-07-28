package com.practice.factory;

import com.practice.factory.families.JavaFullStackEngineer;
import com.practice.factory.families.PythonFullStackEngineer;
import com.practice.fullstack.BackEnd;
import com.practice.fullstack.Database;
import com.practice.fullstack.FrontEnd;

/**
 * This abstract factory class is only responsible for group of object creation of specific platform
 * from here we can pass argument to build product or expectation
 * @author Manish.Luste
 *
 */
public abstract class FullStackEngineerFactory {

	public abstract FrontEnd createFrontEnd(int noe, String expertice);

	public abstract BackEnd createBackEnd();

	public abstract Database createDatabase();
	
	
	
	// Abstract factory method to initialize group of relate object like java full-stack engineer -> front-end, back-end and database
	public static FullStackEngineerFactory getFactory(String fullstackDeveloperType) {

		FullStackEngineerFactory fullstackEngineer = null;

		switch (fullstackDeveloperType) {
		case "javaFullStack":
			fullstackEngineer = new JavaFullStackEngineer();
			break;
		case "PythonFullStack":
			fullstackEngineer = new PythonFullStackEngineer();
			break;
		default:
			throw new IllegalArgumentException("Full Stack Engineer Request type does not match!");

		}

		return fullstackEngineer;

	}

}
