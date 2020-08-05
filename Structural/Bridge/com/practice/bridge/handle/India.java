package com.practice.bridge.handle;

import com.practice.bridge.body.Department;

/**
 * provide abstraction
 * Handle class/implementation contain method definition with body composition 
 *  
 * @author Manish Luste
 *
 */
public class India implements Branch {
	
	private long brachId;
	private String location;
	
	private Department department;
	
	public India(Department department) {
		brachId = 1001;
		location = "Delhi";
		this.department = department;
	}
	
	@Override
	public void getDepartmentsDetail() {
		if (department.isActive()) 
			department.getDepartment();
		
	}

	@Override
	public String manageDepartment(String operation) {
		String httpStatus = "";
		switch(operation) {
		case "Add" :
			department.manageStaff("Add");
			department.manageSkills("Add");
			httpStatus = "OK - Added Successfully!";
			break;
		case "Update" :
			department.manageStaff("Update");
			department.manageSkills("Update");
			httpStatus = "OK - Altered Successfully!";
			break;
		case "delete" :
			department.manageStaff("Delete");
			department.manageSkills("Delete");
			httpStatus = "OK - Removed Successfully!";
			break;
		default:
			throw new IllegalArgumentException("operation does not match or invalid!");
		}
		return httpStatus;
	}

	@Override
	public void getBranchDetail() {
		System.out.println("Branch India [brachId=" + brachId + ", location=" + location + "] \n");
		this.getDepartmentsDetail();
	}

}
