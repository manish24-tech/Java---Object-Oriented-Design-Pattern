package com.practice.adapter.process;

import com.practice.adapter.system.Linux;
import com.practice.adapter.system.Mac;
import com.practice.adapter.system.SystemConfiguration;
import com.practice.adapter.system.Windows;

public class SystemAdapter implements System {

	private SystemConfiguration configuration;
	
	
	public SystemAdapter(String modelName) {
		if(modelName.startsWith("Mac")) {
			this.configuration = new Mac(modelName);
		} else if (modelName.startsWith("Window")) {
			this.configuration = new Windows(modelName);
		} else {
			this.configuration = new Linux(modelName);
		}
	}

	@Override
	public void loadSystem() {
		configuration.softwareConfiguration();
		configuration.hardwareConfiguration();
	}

}
