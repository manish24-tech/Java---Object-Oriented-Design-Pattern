package com.practice.flyweight.factory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

import com.practice.flyweight.organization.Department;
import com.practice.flyweight.organization.HR;
import com.practice.flyweight.organization.IT;
import com.practice.flyweight.organization.Sales;

public class DepartmentFactory {

	static ConcurrentHashMap<String, Department> instance = new ConcurrentHashMap<>();
	
	public static Department getInstance(String type) {
		
		if (!instance.isEmpty() && instance.get(type) != null) {
			return instance.get(type);
		}
		
		switch(type) {
		case "hr":
			return new HR(1001L, Arrays.asList("Event Management","Hire Resources"));
		case "it":
			return new IT(1002L, "IT Department", new HashSet<String>(Arrays.asList("Compatitive Programming", "Unit Testing", "DSA", "Unit Testing")));
		case "sales":
			return new Sales(1003L, "Sales Department","Accounting");
		default:
			throw new IllegalArgumentException("Given instance type does not found!");
		}
	}
}
