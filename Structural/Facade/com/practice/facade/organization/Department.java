package com.practice.facade.organization;

import java.util.Date;

import com.practice.facade.facade.OrganizationUtil;

public class Department {
	
	private Date createdDate;
	
	public Department() {
		this.createdDate = new Date(0L);
	}

	public void manageDepartment(String Operation) {
		if(Operation.equalsIgnoreCase("add")) {
			
			System.out.println("Department.manageHR() => add HR on date: "+ OrganizationUtil.convertUtilToSqlDate(createdDate));
			
		} else if (Operation.equalsIgnoreCase("update")) {
			System.out.println("Department.manageHR() => update HR");
		} else {
			System.out.println("Department.manageHR() => delete HR");
		}
		 
		
	}
	
	public void geDepartment() {
		java.sql.Date sqlDate = new java.sql.Date(0L);
		System.out.println("Department.geHr() => get HR of date: "+ OrganizationUtil.convertSqlToUtilDate(sqlDate));
	}

}
