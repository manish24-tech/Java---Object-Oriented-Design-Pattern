package com.practice.factory.prototype.families;

import com.practice.department.IT_Department;
import com.practice.department.it.GCPEngineer;
import com.practice.factory.prototype.IT_DepartmentFactory;

public class GCPCloudEngineer extends IT_DepartmentFactory {
	
	@Override
	public IT_Department createITDepartment(int staffSize, String description) {
		 GCPEngineer gcpEngineer = new GCPEngineer(staffSize, description);
		IT_DepartmentFactory.putType("gcp", gcpEngineer);
		return gcpEngineer;
	}

}
