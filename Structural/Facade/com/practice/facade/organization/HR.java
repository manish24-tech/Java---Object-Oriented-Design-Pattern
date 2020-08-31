package com.practice.facade.organization;

import java.util.Date;

import com.practice.facade.facade.OrganizationUtil;

public class HR {
	
	private Date createdDate;
	
	public HR() {
		this.createdDate = new Date(0L);
	}

	public void manageHR(String Operation) {
		if(Operation.equalsIgnoreCase("add")) {
			
			System.out.println("HR.manageHR() => add HR on date: "+ OrganizationUtil.convertUtilToSqlDate(createdDate));
			
		} else if (Operation.equalsIgnoreCase("update")) {
			System.out.println("HR.manageHR() => update HR");
		} else {
			System.out.println("HR.manageHR() => delete HR");
		}
		 
		
	}
	
	public void geHr() {
		java.sql.Date sqlDate = new java.sql.Date(0L);
		System.out.println("HR.geHr() => get HR of date: "+ OrganizationUtil.convertSqlToUtilDate(sqlDate));
	}

}
