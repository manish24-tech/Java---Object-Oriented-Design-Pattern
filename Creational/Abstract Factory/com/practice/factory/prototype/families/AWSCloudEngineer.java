package com.practice.factory.prototype.families;

import com.practice.department.IT_Department;
import com.practice.department.it.AWSEngineer;
import com.practice.factory.prototype.IT_DepartmentFactory;

public class AWSCloudEngineer extends IT_DepartmentFactory {
	
	@Override
	public IT_Department createITDepartment(int staffSize, String description) {
		AWSEngineer awsEngineer = new AWSEngineer(staffSize, description);
		IT_DepartmentFactory.putType("aws", awsEngineer);
		return awsEngineer;
	}

}
