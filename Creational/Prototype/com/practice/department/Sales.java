package com.practice.department;

import com.practice.prototype.Department;

public class Sales implements Department {

	int staffSize;
	String description;
	
	public Sales() {
		super();
	}

	public Sales(int staffSize, String description) {
		this.staffSize = staffSize; 
		this.description = description; 
	}
	
	@Override
	public Department copy() {
		return new Sales(staffSize, description);
	}

	@Override
	public String toString() {
		return "Sales [staffSize=" + staffSize + ", description=" + description + "]";
	}
}
