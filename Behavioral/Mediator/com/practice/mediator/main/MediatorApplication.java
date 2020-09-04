package com.practice.mediator.main;

import com.practice.mediator.group.CA;
import com.practice.mediator.group.CEO;
import com.practice.mediator.group.Employee;
import com.practice.mediator.interaction.HRMediator;
import com.practice.mediator.interaction.Mediator;

/**
 * Mediator is allow objects to communicate with each other without direct access for making code loosely coupled and restrict tight dependency of each other
 * Objects interaction done via mediator object only. So, that each object is an-aware about sender and receiver and provide re-usability 
 * Ex. In organization, 1. employee can not represent theirs financial concern directly to CA but its manage via HR as mediator ||   2. employee can not sent resign mail to CEO but its interaction done with HR as mediator
 * At the end mediator preferred only when complex objects interaction is required to be manage independently
 *  
 * @author Manish Luste
 *
 */
public class MediatorApplication {
	
	public static void main(String[] args) {
		
		Mediator mediator =  new HRMediator();
		mediator.notification(new Employee(), "send", "Please raise my salary in this covid-19 situation!");
		mediator.notification(new CA(), "recieve", "EmployeeX is asking for rais cause of covid-19!");
		mediator.notification(new CA(), "send", "10% confirm from CEO");
		mediator.notification(new CEO(), "receive", "CA is asking for 10% for EmployeeX");
		mediator.notification(new CEO(), "receive", "Grant 20% in this covid-19 situation");
		mediator.notification(new Employee(), "recieve", "You will be provided 20% for good work!");
	
		
		
	}
}
