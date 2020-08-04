package com.practice.adapter.main;

import com.practice.adapter.process.EmployeeFormality;
import com.practice.adapter.process.SystemAdapter;

/**
 * Adapter Design Pattern :
 * 
 * 
 * @author Manish Luste
 *
 */
public class AdapterApplication {

	public static void main(String[] args) {
		
		EmployeeFormality employee = new EmployeeFormality(new SystemAdapter("MacBook Pro"));
		employee.giveSystem();
	}

}
