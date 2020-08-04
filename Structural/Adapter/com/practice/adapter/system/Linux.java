package com.practice.adapter.system;

public class Linux implements SystemConfiguration {

	private String modelName;
	
	public Linux() { super(); }
	public Linux(String modelName) {
		super();
		this.modelName = modelName;
	}

	@Override
	public void softwareConfiguration() {
		System.out.println("=> Linux.softwareConfiguration() For "+modelName+" :\n"
				+ "\t 1. OS : ubuntu \n"
				+ "\t 2. Office : MS Office \n"
				+ "\t 3. App : skype \n");
	}

	@Override
	public void hardwareConfiguration() {
		System.out.println("=> Linux.hardwareConfiguration() For "+modelName+" :\n"
				+ "\t 1. Memory : 16GB \n"
				+ "\t 2. Serial Number : X01XX0XXXX1X \n"
				+ "\t 3. Processor : 2.2 GHz intel core i5 \n");
	}
}
