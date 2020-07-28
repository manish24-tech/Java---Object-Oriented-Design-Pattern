package com.practice.department;

import com.practice.prototype.Department;

public class IT implements Department {
	int staffSize;
	String description;

	public IT() {
		super();
	}

	public IT(int staffSize, String description) {
		this.staffSize = staffSize;
		this.description = description;
	}

	@Override
	public Department copy() {
		return new IT(staffSize, description);
	}

	@Override
	public String toString() {
		return "IT [staffSize=" + staffSize + ", description=" + description + "]";
	}

}
