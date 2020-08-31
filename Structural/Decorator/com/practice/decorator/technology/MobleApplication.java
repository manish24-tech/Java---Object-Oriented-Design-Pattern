package com.practice.decorator.technology;

import java.util.LinkedList;
import java.util.List;

public class MobleApplication implements TechnologyStack {

	private int id;
	private String description;
	List<String>  addMobTech = new LinkedList<String>();
	
	
	public MobleApplication(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	@Override
	public void addTechStack(List<String> technology) {
		addMobTech.addAll(technology);
		System.out.println("Mobile tecnologies stack added susccessfully");
	}

	@Override
	public void getTechStack() {
		System.out.println("Mobile Application Stack :");
		System.out.println("ID : "+id+"\nDescription :"+description+"\nTechnologies :");
		addMobTech.forEach(System.out::println);
	}

}
