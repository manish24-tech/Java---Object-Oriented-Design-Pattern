package com.practice.decorator.main;

import java.util.Arrays;

import com.practice.decorator.technology.MobleApplication;
import com.practice.decorator.technology.TechnologyStack;
import com.practice.decorator.technology.WebApplication;
import com.practice.decorator.wrapper.CMS;

/**
 * <b>Decorator Design Pattern:<b/>
 * 
 * Decorator is same as aggregation or composition in which we can generalize one entity reference into another entity
 * Purpose of decorator is used to create a wrapper of core module which having common interface for customization
 * Ex. Organization running with web and Mobile Application development. after sometime it also want to run with CMS framework. so, in this case core module will be same of Technologies stack but it will create a wrapper for CMS technology stack and implement customize core module functionality
 * Wrapper class implements common interface and also generalize decorator type of same interface for customize implementation
 * At the end decorator is used to attach additional behavior of an object at run time by creating wrapper implementation of common interface type
 * 
 * @author Manish Luste
 *
 */
public class DecoratorClient {

	public static void main(String args[]) {
		TechnologyStack webApplication = new WebApplication(1, "Web Application Stack");
		webApplication.addTechStack(Arrays.asList("java", "python"));
		//webApplication.getTechStack();
		
		System.out.println("========================");
		
		TechnologyStack mobApplication = new MobleApplication(2, "Mobile Application Stack");
		mobApplication.addTechStack(Arrays.asList("Android", "IOS"));
		//mobApplication.getTechStack();
		
		System.out.println("========================");
		
		CMS cms = new CMS(3, "CMS framework is combination of web application ", webApplication);
		cms.addTechStack(Arrays.asList("Liferay", "Alfresco"));
		cms.getTechStack(); // This is final technologies stack can be put theirs website
		
		
		
	}
}
