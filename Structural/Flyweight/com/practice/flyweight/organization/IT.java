package com.practice.flyweight.organization;

import java.util.Set;

public class IT implements Department {

	Long code;
	String name;
	Set<String> properties;

	public IT(Long code, String name, Set<String> properties) {
		super();
		this.code = code;
		this.name = name;
		this.properties = properties;
		System.out.println("IT Department has been created");
	}

	@Override
	public void display() {

		System.out.println("=> Department name " + name + " for code : " + code);
		System.out.println("Departments Properties : ");
		properties.forEach(System.out::println);

	}

}
