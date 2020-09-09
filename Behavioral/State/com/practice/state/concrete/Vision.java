package com.practice.state.concrete;

public class Vision implements HelplineState {

	@Override
	public void updateState() {
		System.out.println("Mission.updateState() => Give Customer Satisfaction!");
	}

}
