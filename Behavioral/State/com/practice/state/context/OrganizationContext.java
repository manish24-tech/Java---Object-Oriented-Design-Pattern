package com.practice.state.context;

import com.practice.state.concrete.Business;
import com.practice.state.concrete.HelplineState;

public class OrganizationContext {

	private HelplineState context;
	
	public OrganizationContext() {
		context = new Business();	
	}
	
	public void setState(HelplineState context) {
		this.context = context;
	}
	
	public void getState() {
		context.updateState();
	}

}
