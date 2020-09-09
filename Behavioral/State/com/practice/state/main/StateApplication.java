package com.practice.state.main;

import java.util.Scanner;

import com.practice.state.concrete.Business;
import com.practice.state.concrete.Mission;
import com.practice.state.concrete.TechStack;
import com.practice.state.concrete.Vision;
import com.practice.state.context.OrganizationContext;

/**
 * State/strategy design allows object to change its behavior when its internal state is getting changed. 
 * internal state is nothing but different objects as function/event/behavior of actual object.
 * 
 * @author Manish Luste
 *
 */
public class StateApplication {

	public static void main(String[] args) {
		
		OrganizationContext context = new OrganizationContext();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter helpline number from 1 to 4 :\n"
				+ "\t 1. Business\n"
				+ "\t 2. Mission\n"
				+ "\t 3. Vission\n"
				+ "\t 4. TechStack\n"
				+ "====================>");
		
		switch(scan.nextLine()) {
		case "1":
			context.setState(new Business());
			context.getState();
			scan.close();
			break;
		case "2":
			context.setState(new Mission());
			context.getState();
			scan.close();
			break;
		case "3":
			context.setState(new Vision());
			context.getState();
			scan.close();
			break;
		case "4":
			context.setState(new TechStack());
			context.getState();
			scan.close();
			break;
		default:
			scan.close();
			throw new IllegalArgumentException("Invalid choice!");
		}
		
	}

}
