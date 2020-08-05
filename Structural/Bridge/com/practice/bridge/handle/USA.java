package com.practice.bridge.handle;

import com.practice.bridge.body.Department;

/**
 * provide abstraction
 * Handle class/implementation contain method definition with body composition 
 *  
 * @author Manish Luste
 *
 */
public class USA implements Branch {
	
	private long brachId;
	private String location;
	
	private Department department;
	
	public USA(Department department) {
		brachId = 1002;
		location = "Chicago";
		this.department = department;
	}

	@Override
	public void getDepartmentsDetail() {
		System.out.println("India.getDepartments() : \n\t");
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
		System.out.println("India [brachId=" + brachId + ", location=" + location + "] \n"
				+ "\t DetapartMent Detail : \n\t");
		this.getDepartmentsDetail();
	}

	@Override
	public String toString() {
		return "India [brachId=" + brachId + ", location=" + location + "]";
	}

}
