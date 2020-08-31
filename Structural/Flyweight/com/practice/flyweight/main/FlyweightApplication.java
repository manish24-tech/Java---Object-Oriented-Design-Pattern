package com.practice.flyweight.main;

import com.practice.flyweight.factory.DepartmentFactory;
import com.practice.flyweight.organization.Department;

public class FlyweightApplication {

	public static void main(String[] args) {
		
		
		Department department_HR = DepartmentFactory.getInstance("hr");
		department_HR.display();
		System.out.println("----------- get the same instance----------");
		department_HR.display();
		System.out.println("---------------------");
		Department department_IT = DepartmentFactory.getInstance("it");
		department_IT.display();
		System.out.println("---------------------");
		Department department_Sales = DepartmentFactory.getInstance("sales");
		department_Sales.display();
		
	}

}
