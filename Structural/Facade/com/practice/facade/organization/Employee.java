package com.practice.facade.organization;

import java.util.Date;

import com.practice.facade.facade.OrganizationUtil;

public class Employee {
	
	private Date createdDate;
	
	public Employee() {
		this.createdDate = new Date(0L);
	}

	public void manageEmployee(String Operation) {
		if(Operation.equalsIgnoreCase("add")) {
			
			System.out.println("Employee.manageHR() => add HR on date: "+ OrganizationUtil.convertUtilToSqlDate(createdDate));
			
		} else if (Operation.equalsIgnoreCase("update")) {
			System.out.println("Employee.manageHR() => update HR");
		} else {
			System.out.println("Employee.manageHR() => delete HR");
		}
		 
		
	}
	
	public void geEmployee() {
		java.sql.Date sqlDate = new java.sql.Date(0L);
		System.out.println("Employee.geHr() => get HR of date: "+ OrganizationUtil.convertSqlToUtilDate(sqlDate));
	}

}
