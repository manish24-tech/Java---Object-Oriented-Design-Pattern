package com.practice.state.concrete;

public class Business implements HelplineState {

	@Override
	public void updateState() {

		System.out.println("Business.updateState() => Do business with us!");
	}

}
