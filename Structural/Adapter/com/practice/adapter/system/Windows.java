package com.practice.adapter.system;

public class Windows implements SystemConfiguration {

	private String modelName;
	
	public Windows() { super(); }
	public Windows(String modelName) {
		super();
		this.modelName = modelName;
	}

	@Override
	public void softwareConfiguration() {
		System.out.println("=> Windows.softwareConfiguration() For "+modelName+" :\n"
				+ "\t 1. OS : Windows8 \n"
				+ "\t 2. Office : MS Office \n"
				+ "\t 3. App : skype \n");
	}

	@Override
	public void hardwareConfiguration() {
		System.out.println("=> Windows.hardwareConfiguration() For "+modelName+" :\n"
				+ "\t 1. Memory : 16GB \n"
				+ "\t 2. Serial Number : X01XX0XXXX1X \n"
				+ "\t 3. Processor : 2.2 GHz intel core i5 \n");
	}

}
