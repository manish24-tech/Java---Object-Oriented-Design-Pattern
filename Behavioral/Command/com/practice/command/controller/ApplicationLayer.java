package com.practice.command.controller;

import com.practice.command.command.Project;
/**
 * Responsible to delegate the client request from GUI
 * @author Manish Luste
 *
 */
public class ApplicationLayer {
	
	Project project;
	
	public ApplicationLayer(Project projectCommand) {
		this.project = projectCommand;
	}
	
	public void addProjectRequest() {
		System.out.println("ApplicationLayer.addProjectRequest() => 2. Requst for add project detail ");
		project.serveAddProjectRequest();
	}
	
	public void editProjectRequest() {
		System.out.println("ApplicationLayer.editProjectRequest() => 2. Requst for edit project detail ");
		project.serveEditProjectRequest();
	}
	
	public void getProjectRequest() {
		System.out.println("ApplicationLayer.getProjectRequest() => 2. Requst for get project detail ");
		project.serveGetProjectRequest();
	}
}
