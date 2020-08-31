package com.practice.composite.main;

import java.util.Arrays;

import com.practice.composite.component.Organization;
import com.practice.composite.component.OrganizationLeaf;

/**
 * <b>Composite Design Pattern:<b/>
 * 
 * Compose the group of objects of same type(component) to create hierarchy
 * Component(I): common interface with transnational method which are common in both Leaf(C) and Composite(C) element
 * Leaf Element(C): it is root element that implement component which create summation of composite elements. it does not have sub elements
 * Composite Element(C): group of classes that implement component(C) which add different leaf elements category and display consolidate result of sub elements also
 * ex. one organization categorize with different region and region categorize with different sub branches. Component = organization, Leaf Element = OrganizationLeaf and composite Elements = [India , USA ... etc]
 * At the end composite is to compose group of object of same type single hierarchically with basic and composite element
 * 
 * @author Manish Luste
 *
 */
public class CompositeApplication {

	public static void main(String[] args) {
		
		Organization departmentCategory1 = new OrganizationLeaf(101, 400, Arrays.asList(new String[]{"IT","HR","Finance","Sales"}));
		Organization departmentCategory2 = new OrganizationLeaf(102, 200, Arrays.asList(new String[]{"SE","IT"}));
		
		// departmentCategory1.getBranchDetail();
		
		Organization branch1 = new com.practice.composite.branch.India("India", "Gujarat");
		branch1.addComponent(departmentCategory1);
		branch1.addComponent(departmentCategory2);
		branch1.getBranchDetail();
		

	}

}
