package com.practice.mediator.group;

import com.practice.mediator.interaction.Mediator;

public interface Organization {

	void setMediator(Mediator mediator);
	String getMediatorName();
	
	void sendMessage(String message);
	
	void receiveMessage(String message);
}
