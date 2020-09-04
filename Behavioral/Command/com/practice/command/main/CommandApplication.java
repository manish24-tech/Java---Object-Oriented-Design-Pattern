package com.practice.command.main;

import com.practice.command.command.ProjectCommand;
import com.practice.command.controller.ApplicationLayer;

/**
 * Command is a middle layer to flow the client request from sender to receiver with carrying data with/without parameter like "principle of separation of concerns":
  1. Client is requesting from GUI - click button
  2. Application layer delegate the request and give command for action
  3. Command object is carry the data and send to service layer
  4. Service layer perform business logic and send to receiver
  
 * Command encapsulate duplicate request in single unit and delegate the same operation from various GUI places. So, it is just an interface with various parameterized method that implement by service layers. application layer have reference of this command object  to serve the request
 * Ex. in organization, an project can be added from various GUI screen with button that open same employee form to delegate add request with data to be serve by command object
 * At the end command object is middle layer between application and service layer to serve the client request like Model-View-Controller architecture 

 * @author Manish Luste
 *
 */
public class CommandApplication {

	public static void main(String[] args) {

		ApplicationLayer applicationLayer = new ApplicationLayer(new ProjectCommand());
		System.out.println("CommandApplication.main() => 1. client request by click on button");
		applicationLayer.addProjectRequest();
	
		
	}
}
