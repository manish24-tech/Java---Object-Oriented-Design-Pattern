package com.practice.fullstack.database;

import com.practice.fullstack.Database;

/**
 * This is factory implementation class having all the final product information also known as concreat class
 * @author Manish Luste
 *
 */
public class Oracle implements Database {

	@Override
	public void getDatabseDescription() {
		System.out.println("Oracle.getDatabseDescription()");
	}

}
