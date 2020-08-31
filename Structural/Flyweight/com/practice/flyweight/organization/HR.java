package com.practice.flyweight.organization;

import java.util.List;

public class HR implements Department {

	Long code;
	private final String name;
	List<String> properties;

	public HR(Long code, List<String> properties) {
		this.code = code;
		this.name = "HR Department";
		this.properties = properties;
		System.out.println("HR Department has been created");
	}


	@Override
	public void display() {
		System.out.println("=> Department name "+name+" for code : "+code);
		System.out.println("Departments Properties :");
		properties.forEach(System.out::println);
	}

}
