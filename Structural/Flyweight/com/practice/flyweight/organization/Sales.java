package com.practice.flyweight.organization;

public class Sales implements Department {

	Long code;
	String name;
	String property;

	public Sales(Long code, String name, String property) {
		this.code = code;
		this.name = name;
		this.property = property;
		System.out.println("Sales Department has been created");
	}

	@Override
	public void display() {
		System.out.println("=> Department name " + name + " for code : " + code);
		System.out.println("Departments Properties : " + property);
	}

}
