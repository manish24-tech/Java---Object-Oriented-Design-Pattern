package com.practice.command.service;

/**
 * Responsible to perform data persistence to appropriate database  
 * @author Manish Luste
 *
 */
public class ServiceLayer {

	public void addAddProjectToDB() {
		//jdbc architecture to store data into database
		System.out.println("ServiceLayer.addAddProjectToDB() : 4. Project data stored to database successfully");
	}
	public void updateProjectToDB() {
		//jdbc architecture to store data into database
		System.out.println("ServiceLayer.addAddProjectToDB() : 4. Project data altered to database successfully");	
	}
	public void serveGetProjectFromDB() {
		//jdbc architecture to store data into database
		System.out.println("ServiceLayer.addAddProjectToDB() : 4. Project data got from database successfully");
	}
}
