package com.practice.factory.singleton;

import com.practice.factory.singleton.families.SpringMinStackEngineer;
import com.practice.fullstack.BackEnd;
import com.practice.fullstack.FrontEnd;

public abstract class MinStackEngineerFactory {
	
	public abstract FrontEnd createFrontEnd(int noe, String expertice);

	public abstract BackEnd createBackEnd();
	
	// Abstract factory method to initialize group of relate object like java full-stack engineer -> front-end, back-end and database
	public static MinStackEngineerFactory getFactory(String fullstackDeveloperType) {

		MinStackEngineerFactory minStackEngineer = null;

		switch (fullstackDeveloperType) {
		case "SpringMinStack":
			minStackEngineer = SpringMinStackEngineer.getInstance();
			break;
		case "hibernateMinStack":
			//minStackEngineer = new PythonFullStackEngineer();
			break;
		default:
			throw new IllegalArgumentException("Min Stack Engineer Request type does not match!");

		}

		return minStackEngineer;

	}
}
