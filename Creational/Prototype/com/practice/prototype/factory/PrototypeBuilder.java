package com.practice.prototype.factory;

import java.util.HashMap;
import java.util.Map;

import com.practice.department.HR;
import com.practice.department.IT;
import com.practice.department.Sales;
import com.practice.prototype.Department;

public abstract class PrototypeBuilder {

	private static Map<String, Department> departmentCache = new HashMap<>();
	
	private PrototypeBuilder() {
	    throw new IllegalStateException("state management for static members as per sonar lint suggestion");
	}

	private static Department putType(String key, Department department) {
		if (!key.isEmpty() && department != null) {
			return departmentCache.put(key, department);
		}
		return null;
	}

	public static Department getType(String key) {
		if (!key.isEmpty()) {
			return departmentCache.get(key).copy();
		}
		return null;
	}

	public static Department getPrototype(String prototype) {
		Department departmentFactory;
		
		switch (prototype) {
		case "HR":
			departmentFactory = new HR(5, "Managing Activities");
			putType("HR", departmentFactory);
			break;
		case "Sales":
			departmentFactory = new Sales(10, "Managing Finance");
			putType("Sales", departmentFactory);
			break;
		case "IT":
			departmentFactory = new IT(25, "Managing Hardware & software");
			putType("IT", departmentFactory);
			break;
		default:
			throw new IllegalArgumentException("Prototype does not match or invalid!");
		}
		return  departmentFactory;
	}
}
