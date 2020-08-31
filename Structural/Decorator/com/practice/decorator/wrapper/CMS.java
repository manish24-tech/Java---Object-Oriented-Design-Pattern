package com.practice.decorator.wrapper;

import java.util.List;

import com.practice.decorator.technology.TechnologyStack;

public class CMS implements TechnologyStack {
	
	private TechnologyStack tech; 
	private int id;
	private String description;	
	

	public CMS(int id, String description, TechnologyStack tech) {
		this.id = id;
		this.description = description;
		this.tech = tech;
	}

	@Override
	public void addTechStack(List<String> technology) {
		//tech.getTechStack(); // Previous tech stack
		tech.addTechStack(technology); //customize consolidate tech stack
	}

	@Override
	public void getTechStack() {
		System.out.println("Web Application Stack :");
		System.out.println("ID : "+id+"\nDescription :"+description+"\nCMS also contain consolidate application stacks :");
		tech.getTechStack();	
	}

}
