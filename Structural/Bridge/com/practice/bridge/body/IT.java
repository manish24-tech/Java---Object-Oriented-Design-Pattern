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
public class IT implements Department {
	
	private long id;
	private String role;
	private Map<String, String> staffMap;
	private LinkedList<String> linkedList;

	public IT() {
		super();
	}
	
	public IT(long id, String role) {
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
			staffMap.put("EMP4", "Ken");
			staffMap.put("EMP5", "Len");
			staffMap.put("EMP6", "Hen");
			
			break;
		case "Update" :
			staffMap = new LinkedHashMap<>(); // suppose getting from another service
			staffMap.put("EMP4", "Gam");
			staffMap.put("EMP5", "Yan");
			staffMap.put("EMP6", "Pan");
			break;
		case "delete" :
			staffMap = new LinkedHashMap<>(); // suppose getting from another service
			staffMap.put("EMP4", "wan");
			staffMap.put("EMP5", "ban");
			staffMap.put("EMP6", "Jan");
			staffMap.remove("EMP4"); 
			break;
		default:
			throw new IllegalArgumentException("operation does not match or invalid!");
		}
		return staffMap;
	}

	@Override
	public List<String> manageSkills(String operation) {
		
		
		switch(operation) {
		case "Add" :
			linkedList = new LinkedList<>();
			linkedList.add("Networking");
			linkedList.add("Hardware");
			linkedList.add("Software");
			break;
		case "Update" :
			linkedList = new LinkedList<>();// suppose getting from another service
			linkedList.add("Cloud");
			linkedList.add("Hardware");
			linkedList.add("Software");
			break;
		case "delete" :
			linkedList = new LinkedList<>();// suppose getting from another service
			linkedList.add("Networking");
			linkedList.add("Hardware");
			linkedList.add("Software");
			linkedList.add("Cloud");
			linkedList.remove("Hardware"); 
			break;
		default:
			throw new IllegalArgumentException("operation does not match or invalid!");
		}
		return linkedList;
	}

	@Override
	public void getDepartment() {
		System.out.println("\t -> Department IT [id=" + id + ", role=" + role + ", staff=" + staffMap + ", skills=" + linkedList + "] \n");
		
	}

}
