package com.practice.factory.prototype;

import java.util.HashMap;
import java.util.Map;

import com.practice.department.IT_Department;
import com.practice.factory.prototype.families.AWSCloudEngineer;
import com.practice.factory.prototype.families.GCPCloudEngineer;

public abstract class IT_DepartmentFactory {

	public static Map<String, IT_Department> itDepartment = new HashMap<>();
	
	public abstract IT_Department createITDepartment(int staffSize, String description);

	public static IT_Department putType(String key, IT_Department department) {
		if (!key.isEmpty() && department != null) {
			return itDepartment.put(key, department);
		}
		return null;
	}

	public static IT_Department getType(String key) {
		return  itDepartment.get(key).copy();
	}
	
	public static IT_DepartmentFactory getPrototype(String prototype) {
		IT_DepartmentFactory department = null;

		switch (prototype) {
		case "AWS":
			department = new AWSCloudEngineer();
			break;
		case "GCP":
			department = new GCPCloudEngineer();
			break;
		default:
			throw new IllegalArgumentException("prototyoe for IT department does not match!");

		}
		return department;

	}
}
