package com.practice.composite.branch;

import java.util.LinkedList;
import java.util.List;

import com.practice.composite.component.Organization;

public class USA implements Organization {

	String branchName;
	public List<Organization> component = new LinkedList<>();
	
	public USA(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public void addComponent(Organization org) {
		this.component.add(org);
	}

	@Override
	public void getBranchDetail() {
		System.out.println("India.getBranchDetail() : Branch : "+branchName);
		for(Organization org: component) {
			org.getBranchDetail();
		}

	}



	

}
