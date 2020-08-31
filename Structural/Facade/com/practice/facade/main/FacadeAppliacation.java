package com.practice.facade.main;

import com.practice.facade.organization.HR;

/**
 * <b>Facade Design Pattern:<b/>
 * 
 * Facade is library that encapsulate complex application business logic of a sub systems into a class that wrap into static/non-static method such as utility class/java 8 functional interface
 * Facade has limited responsibility but it separate business logic operated by other sub systems/modules/components. So, every sub system does not contain larger body and just have callback function from facade object
 * Ex. Organization have many objects with default fields for audit(createdDate, modifiedDate) and store, retrieve date operation is common for all objects. So, date conversion can be manage by facade class/functional interface. its just a simple but it can be service layer like add, update, delete data to/from DB in MVC pattern
 * At the end facade is library/utility that separate complex business logic from sub modules to short the body of code and provide loosely coupled code
 * 
 * @author Manish Luste
 *
 */
public class FacadeAppliacation {
	
	public static void main(String[] args) {
		
		HR hr = new HR();
		hr.manageHR("add");
		hr.geHr();
	}

}
