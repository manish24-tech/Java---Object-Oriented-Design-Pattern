package com.practice.mediator.group;

import com.practice.mediator.interaction.Mediator;

public class Employee implements Organization {

	private Mediator mediator;
	
	@Override
	public void sendMessage(String message) {
		System.out.println("Employee.sendMessage() => "+message);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("Employee.receiveMessage() => "+message);
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public String getMediatorName() {
		return this.getClass().getName();
	}


}
