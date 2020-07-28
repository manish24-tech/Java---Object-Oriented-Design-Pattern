package com.practice.model;

public class PersonalDetail {
	
	String name;
	int age;
	
	public PersonalDetail() {}
	
	public PersonalDetail(String name, int age) {
		
		if(name.isEmpty() && age < 20)
			throw new NullPointerException("Developer is not eligible or incomplite personal detail");
		
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PersonalDetail [name=" + name + ", age=" + age + "]";
	}
	
}
