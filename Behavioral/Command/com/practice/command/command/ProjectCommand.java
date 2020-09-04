package com.practice.command.command;

import com.practice.command.service.ServiceLayer;

/**
 * Responsible to serve the client request
 * @author Manish Luste
 *
 */
public class ProjectCommand implements Project {

	ServiceLayer projectservice;
	
	public ProjectCommand() {
		this.projectservice = new ServiceLayer();
	}
	
	public ProjectCommand(ServiceLayer projectservice) {
		this.projectservice = projectservice;
	}
	
	@Override
	public void serveAddProjectRequest() {
		
		System.out.println("ProjectCommand.serveAddProjectRequest() => 3. recieved requset form application layer to be served");
		// perform some validation check
		projectservice.addAddProjectToDB();
	}

	@Override
	public void serveEditProjectRequest() {
		System.out.println("ProjectCommand.serveAddProjectRequest() => 3. recieved requset form application layer to be served");
		// perform some validation check
		projectservice.updateProjectToDB();
	}

	@Override
	public void serveGetProjectRequest() {
		System.out.println("ProjectCommand.serveAddProjectRequest() => 3. recieved requset form application layer to be served");
		// perform some validation check
		projectservice.updateProjectToDB();
	}

}
