package com.practice.fullstack.frontend;

import com.practice.fullstack.FrontEnd;

/**
 * This is factory implementation class having all the final product information also known as concreat class
 * @author Manish Luste
 *
 */
public class React implements FrontEnd {

	int noe;
	String expertice;
	
	
	public React() {
		super();
	}
	
	public React(int noe, String expertice) {
		this.noe = noe;
		this.expertice = expertice;
	}
	
	@Override
	public void getFrontEndDescription() {
		System.out.println("React.getFrontEndDescription()");
		System.out.println("\t No Of Experieance: "+noe+" | Expertiece in:"+expertice);
	}

}
