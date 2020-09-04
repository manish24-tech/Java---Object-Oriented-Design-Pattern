package com.practice.mediator.interaction;

import com.practice.mediator.group.CA;
import com.practice.mediator.group.CEO;
import com.practice.mediator.group.Employee;
import com.practice.mediator.group.Organization;

public class HRMediator implements Mediator {

	private CA ca;
	private CEO ceo;
	private Employee employee;

	@Override
	public void notification(Organization staff, String event, String message) {
		
		staff.setMediator(this);
		
		switch(staff.getMediatorName()) {
		case "com.practice.mediator.group.Employee":
			employee = (Employee) staff;
				
			if (event.equalsIgnoreCase("send")) {
				employee.sendMessage(message);
			} else {
				employee.receiveMessage(message);
			}
			
			break;
		case "com.practice.mediator.group.CA":
			ca = (CA) staff;
			
			if (event.equalsIgnoreCase("send")) {
				ca.sendMessage(message);
			} else {
				ca.receiveMessage(message);
			}
			break;
		case "com.practice.mediator.group.CEO":
			ceo = (CEO) staff;
			
			if (event.equalsIgnoreCase("send")) {
				ceo.sendMessage(message);
			} else {
				ceo.receiveMessage(message);
			}
			
			break;
		default:
			throw new IllegalArgumentException("case not found!"); 
				
		}
		
		
	}


}
