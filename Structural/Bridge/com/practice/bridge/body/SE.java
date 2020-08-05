package com.practice.bridge.body;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Body class/implementation contain method definition
 *  
 * @author Manish Luste
 *
 */
public class SE implements Department {
	
	private long id;
	private String role;
	private Map<String, String> staffMap;
	private LinkedList<String> linkedList;

	public SE() {
		super();
	}
	
	public SE(long id, String role) {
		this.id = id;
		this.role = role;
	}

	@Override
	public Boolean isActive() {
		return Boolean.TRUE;
	}

	@Override
	public Map<String, String> manageStaff(String operation) {
		
		switch(operation) {
		case "Add" :
			staffMap = new LinkedHashMap<>();
			staffMap.put("EMP1", "Ken");
			staffMap.put("EMP2", "Len");
			staffMap.put("EMP3", "Hen");
			
			break;
		case "Update" :
			staffMap = new LinkedHashMap<>(); // suppose getting from another service
			staffMap.put("EMP1", "Ren");
			staffMap.put("EMP2", "Yen");
			staffMap.put("EMP3", "Pen");
			break;
		case "delete" :
			staffMap = new LinkedHashMap<>(); // suppose getting from another service
			staffMap.put("EMP1", "Ren");
			staffMap.put("EMP2", "Yen");
			staffMap.put("EMP3", "Pen");
			staffMap.remove("EMP2"); 
			break;
		default:
			throw new IllegalArgumentException("Prototype does not match or invalid!");
		}
		return staffMap;
	}

	@Override
	public List<String> manageSkills(String operation) {
		switch(operation) {
		case "Add" :
			linkedList = new LinkedList<>();
			linkedList.add("Angular");
			linkedList.add("Java");
			linkedList.add("Spring Boot");
			break;
		case "Update" :
			linkedList = new LinkedList<>();// suppose getting from another service
			linkedList.add("React");
			linkedList.add("Python");
			linkedList.add("JPA");
			break;
		case "delete" :
			linkedList = new LinkedList<>();// suppose getting from another service
			linkedList.add("Angular");
			linkedList.add("Python");
			linkedList.add("Java");
			linkedList.add("Spring Boot");
			linkedList.remove("Python"); 
			break;
		default:
			throw new IllegalArgumentException("operation does not match or invalid!");
		}
		return linkedList;
	}
	
	@Override
	public void getDepartment() {
		System.out.println("\t -> Department SE [id=" + id + ", role=" + role + ", staff=" + staffMap + ", skills=" + linkedList + "] \n");
		
	}
}
