package com.practice.department;

import com.practice.prototype.Department;

public class HR implements Department {
	int staffSize;
	String description;

	public HR() {
		super();
	}

	public HR(int staffSize, String description) {
		this.staffSize = staffSize;
		this.description = description;
	}

	@Override
	public Department copy() {
		return new HR(staffSize, description);
	}

	@Override
	public String toString() {
		return "HR [staffSize=" + staffSize + ", description=" + description + "]";
	}

}
