package com.practice.bridge.main;

import com.practice.bridge.body.IT;
import com.practice.bridge.handle.Branch;
import com.practice.bridge.handle.India;

/**
 * <b>Bridge Design Pattern:<b/>
 * 
 * Provide a hierarchy of two different (abstraction and implementation) classes implementation which can be developed independently for each other
 * Abstraction:  an appearance of the core logic as a handle and delegate implementation 
 * Implementation: an app logic as a  body that decoupled abstraction 
 * 
 * It required new sub-classes to be developed at run-time binding or switch to new implementation from old one like inheritance mechanism 
 * 
 * Adapter vs Bridge
 * 1. Adapter is provide object composition between incompatible interfaces and classes with help of adapter class while bridge provide composition between independent implementation in form of hierarchy with decouple abstraction from implementation as bridge
 * 2. Both use constructor injection for composition 
 * 
 * At the end bridge is divide and organize classes in form of hierarchy with different implementation. ex. cross-platform domain
 * 
 * @author Manish Luste
 *
 */
public class BridgeApplication {

	public static void main(String[] args) {
		
		// composition between branch and department
		Branch organization = new India(new IT(11, "Associate"));
		String isActiveDepartment = organization.manageDepartment("Add");
		if(isActiveDepartment.equalsIgnoreCase("OK - Added Successfully!")) {
			organization.getBranchDetail();
		}
	}
}
