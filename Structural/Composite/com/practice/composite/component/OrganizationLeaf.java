package com.practice.composite.component;

import java.util.List;

/**
 * it is root element that implement component which create summation of composite elements. it does not have sub elements
 * @author Manish Luste
 *
 */
public class OrganizationLeaf implements Organization {

	private long brachCode;
	private int staff;
	private List<String> departments;

	public OrganizationLeaf(long brachCode, int staff, List<String> departments) {
		super();
		this.brachCode = brachCode;
		this.staff = staff;
		this.departments = departments;
	}

	@Override
	public void getBranchDetail() {
		System.out.println("\t Brach Code => "+brachCode+" with "+staff+" Staff");
		System.out.println("\t Departments : "+departments+"\n");
	}

	@Override
	public void addComponent(Organization department) {		
	}

}
