package com.practice.composite.branch;

import java.util.LinkedList;
import java.util.List;

import com.practice.composite.component.Organization;

public class India implements Organization {

	String branchName;
	String location;
	List<Organization> component = new LinkedList<>();
	
	public India(String branchName, String location) {
		this.branchName = branchName;
		this.location = location;
	}

	@Override
	public void addComponent(Organization org) {
		this.component.add(org);
	}

	@Override
	public void getBranchDetail() {
		System.out.println("India.getBranchDetail() : Branch : "+branchName+"-"+location);
		for(Organization org: component) {
			org.getBranchDetail();
		}

	}



	

}
