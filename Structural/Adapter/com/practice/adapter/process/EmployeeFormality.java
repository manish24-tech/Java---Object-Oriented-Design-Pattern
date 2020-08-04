package com.practice.adapter.process;

public class EmployeeFormality {
	
	private System system;
	
	
	public EmployeeFormality(System system) {
		super();
		this.system = system;
	}
	
	public void giveSystem() {
		system.loadSystem();
	}
	
	public void receiveSystem() {
		system.loadSystem();
	}
	
}
