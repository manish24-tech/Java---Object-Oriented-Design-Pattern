package com.practice.adapter.system;

public class Mac implements SystemConfiguration {

	private String modelName;
	
	public Mac() { super(); }
	public Mac(String modelName) {
		super();
		this.modelName = modelName;
	}

	@Override
	public void softwareConfiguration() {
		
		System.out.println("=> Mac.softwareConfiguration() For "+modelName+" :\n"
				+ "\t 1. OS : Catalina \n"
				+ "\t 2. Office : MS Office \n"
				+ "\t 3. App : skype \n");
		
	}

	@Override
	public void hardwareConfiguration() {
		System.out.println("=> Mac.hardwareConfiguration() For "+modelName+" :\n"
				+ "\t 1. Memory : 16GB \n"
				+ "\t 2. Serial Number : X01XX0XXXX1X \n"
				+ "\t 3. Processor : 2.2 GHz intel core i7 \n");
	}

}
