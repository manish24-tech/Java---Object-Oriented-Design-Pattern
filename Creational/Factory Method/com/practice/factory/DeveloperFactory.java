package com.practice.factory;

import com.practice.developers.BackEndDeveloper;
import com.practice.developers.FrontEndDeveloper;
import com.practice.developers.UxDeveloper;

/**
 * This Factory Class is responsible for different object initialization based on specific type
 *  
 * @author Manish Luste
 *
 */
public class DeveloperFactory {

	public Developer getDeveloperInstance(String developerType) {

		Developer developerInstance = null;

		switch (developerType) {
		case "Back-End":
			developerInstance = new BackEndDeveloper(developerType);
			break;
		case "Front-End":
			developerInstance = new FrontEndDeveloper(developerType);
			break;
		case "UX":
			developerInstance = new UxDeveloper(developerType);
			break;
		default:
			throw new IllegalArgumentException("Developer instance does not initialize because of its type mismatch");
		}

		return developerInstance;
	}
	
}
