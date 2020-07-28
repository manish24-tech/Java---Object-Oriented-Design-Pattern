package com.practice.department.it;

import com.practice.department.IT_Department;

public class GCPEngineer implements IT_Department {

	int staffSize;
	String description;
	
	// Default
	public GCPEngineer() {
		super();
	}
	
	// Parameterize 
	public GCPEngineer(int staffSize, String description) {
		
		if(staffSize == 0 && description.isEmpty())
			throw new IllegalArgumentException("GCP engineer detail is invalid or something is missmathch!");
		
		this.staffSize = staffSize;
		this.description = description;
	}
	
	// copy constructor 
	public GCPEngineer(GCPEngineer source) {
		this.staffSize = source.staffSize;
		this.description = source.description;
	}
	
	// copy method which have same copy of this class (copy constructor)
	public IT_Department copy() {
	    return new GCPEngineer(this);
	}

	@Override
	public String toString() {
		return "GCPEngineer [staffSize=" + staffSize + ", description=" + description + "]";
	}

	@Override
	public void getDescription() {
		System.out.println("GCPEngineer [staffSize=" + staffSize + ", description=" + description + "]");
	}
}
