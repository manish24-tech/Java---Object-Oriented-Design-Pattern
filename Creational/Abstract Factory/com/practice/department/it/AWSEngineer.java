package com.practice.department.it;

import com.practice.department.IT_Department;

public class AWSEngineer implements IT_Department {

	private int staffSize;
	private String description;
	
	public AWSEngineer() {
		super();
	}
	
	public AWSEngineer(int staffSize, String description) {
		
		if(staffSize == 0 && description.isEmpty())
			throw new IllegalArgumentException("AWS engineer detail is invalid or something is missmathch!");
		
		this.staffSize = staffSize;
		this.description = description;
	}
	
	// copy
	public AWSEngineer(AWSEngineer source) {
		this.staffSize = source.staffSize;
		this.description = source.description;
	}
	
	@Override
	public IT_Department copy() {
		return new AWSEngineer(this);
	}

	@Override
	public String toString() {
		return "AWSEngineer [staffSize=" + staffSize + ", description=" + description + "]";
	}

	@Override
	public void getDescription() {
		System.out.println("AWSEngineer [staffSize=" + staffSize + ", description=" + description + "]");
	}

}
