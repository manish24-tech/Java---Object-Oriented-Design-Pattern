package com.practice.factory.singleton.families;

import com.practice.factory.singleton.MinStackEngineerFactory;
import com.practice.fullstack.BackEnd;
import com.practice.fullstack.FrontEnd;
import com.practice.fullstack.backend.SpringBoot;
import com.practice.fullstack.frontend.Angular;

public class SpringMinStackEngineer extends MinStackEngineerFactory {

	// create/read instance in/from main memory to solve multi-threading environment
	private static volatile SpringMinStackEngineer instance;
	
	private SpringMinStackEngineer() {
	}

	@Override
	public FrontEnd createFrontEnd(int noe, String expertice) {
		return new Angular(noe,expertice);
	}

	@Override
	public BackEnd createBackEnd() {
		return new SpringBoot();
	}
	
	//singleton instance
	public static SpringMinStackEngineer getInstance() {
		SpringMinStackEngineer getInstance = instance;
		
		// reading from cache which but with same instance reference from main memory
		if(getInstance != null) {
			return getInstance;
		}
		
		// creating new instance in main memory if not instantiate earlier compatible with multi-threading
		synchronized (SpringMinStackEngineer.class) {
			if (instance  == null) {
				instance = new SpringMinStackEngineer();
			}
			return instance;
		}
		
	}

}
