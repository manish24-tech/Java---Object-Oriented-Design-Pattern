package com.practice.mediator.interaction;

import com.practice.mediator.group.Organization;

public interface Mediator {

	void notification(Organization staff, String event, String message);
	
}
