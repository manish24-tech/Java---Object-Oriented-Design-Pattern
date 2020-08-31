package com.practice.facade.facade;

import java.sql.Date;

public class OrganizationUtil {

	public static java.util.Date convertSqlToUtilDate(Date date) {
		if(date != null) {
			return new java.util.Date(date.getTime());
		}
		return new java.util.Date();
		
	}
	
	public static java.sql.Date convertUtilToSqlDate(java.util.Date date) {
		
		if(date != null) {
			return new Date(date.getTime());
		}
		return new Date(0L);	
	}
}
