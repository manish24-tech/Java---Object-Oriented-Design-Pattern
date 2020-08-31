package com.practice.decorator.technology;

import java.util.LinkedList;
import java.util.List;

public class WebApplication implements TechnologyStack {
	private int id;
	private String description;
	List<String>  addWebTech = new LinkedList<String>();
	
	public WebApplication(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	@Override
	public void addTechStack(List<String> technology) {
		addWebTech.addAll(technology);
		System.out.println("Web tecnologies stack added susccessfully");
	}

	@Override
	public void getTechStack() {
		System.out.println("Web Application Stack :");
		System.out.println("ID : "+id+"\nDescription :"+description+"\nTechnologies :");
		addWebTech.forEach(System.out::println);
	}

}
