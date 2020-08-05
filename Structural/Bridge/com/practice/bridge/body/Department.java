package com.practice.bridge.body;

import java.util.List;
import java.util.Map;

/**
 * Body interface contain reusable method declaration for subclasses
 *  
 * @author Manish Luste
 *
 */
public interface Department {

	Boolean isActive();

	Map<String, String> manageStaff(String operation);

	List<String> manageSkills(String operation);
	
	void getDepartment();

}
