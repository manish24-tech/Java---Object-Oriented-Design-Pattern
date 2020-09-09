package com.practice.state.concrete;

public class Mission implements HelplineState {

	@Override
	public void updateState() {
		
		System.out.println("Mission.updateState() => Give service to all over world!");

	}

}
