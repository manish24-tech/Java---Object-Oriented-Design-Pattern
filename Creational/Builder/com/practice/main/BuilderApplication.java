package com.practice.main;

import com.practice.builder.CoFounderRoomBuilder;
import com.practice.builder.EmployeeRoomBuilder;
import com.practice.director.OrganizationDirector;

/**
 * Builder Design Pattern:
 * 
 * Provide a aggregation of different types of object into master object to build/construct complex object step by step
 * It is nothing more then setter-getter and allow collaboration between objects
 * Object Builder : having * entity reference into 1 entity
 * Object Director : constructing object which have repetitive/fixed task 
 * ex. building product in factory by machine(Builder Design Pattern)
 * Provide re-usability and molecularity for object construction by director class 
 * At the end it is most easy and preferable design pattern used in real time complex project to perform fixed object creation step by step and build master object 

 * @author Manish Luste
 *
 */
public class BuilderApplication {

	public static void main(String[] args) {
		//Builder
		CoFounderRoomBuilder coFounderRoomBuilder = new CoFounderRoomBuilder("CEO");
		//Director : CEO Room Builder
		new OrganizationDirector().constructCoFounderCabin(coFounderRoomBuilder);
		System.out.println(coFounderRoomBuilder.toString());

		
		//Builder
		EmployeeRoomBuilder empRoomBuilder = new EmployeeRoomBuilder();
		//Director : Employee Room Builder
		new OrganizationDirector().constructEmployeeCabin(empRoomBuilder); 
			
		System.out.println(empRoomBuilder.toString());
	


	}

}
