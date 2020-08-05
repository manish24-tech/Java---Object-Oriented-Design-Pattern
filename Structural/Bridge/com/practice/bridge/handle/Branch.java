package com.practice.bridge.handle;

/**
 * Handle interface contain reusable method declaration for abstraction
 *  
 * @author Manish Luste
 *
 */
public interface Branch {

	void getDepartmentsDetail();

	String manageDepartment(String operation);

	void getBranchDetail();

}
