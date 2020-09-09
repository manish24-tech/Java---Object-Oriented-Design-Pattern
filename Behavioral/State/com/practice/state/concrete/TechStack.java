package com.practice.state.concrete;

public class TechStack implements HelplineState {

	@Override
	public void updateState() {
		System.out.println("Mission.updateState() => FullStack developement!");
	}

}
