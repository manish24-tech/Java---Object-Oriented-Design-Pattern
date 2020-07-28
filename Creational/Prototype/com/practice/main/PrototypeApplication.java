package com.practice.main;

import com.practice.prototype.Department;
import com.practice.prototype.factory.PrototypeBuilder;

public class PrototypeApplication {

	public static void main(String[] args) {
		
		 Department prototype = PrototypeBuilder.getPrototype("IT");
		 System.out.println(prototype);
		 
		 Department type = PrototypeBuilder.getType("IT");
		 System.out.println(type);
	}

}
