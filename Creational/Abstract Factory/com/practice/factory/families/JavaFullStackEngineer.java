package com.practice.factory.families;

import com.practice.factory.FullStackEngineerFactory;
import com.practice.fullstack.BackEnd;
import com.practice.fullstack.Database;
import com.practice.fullstack.FrontEnd;
import com.practice.fullstack.backend.SpringBoot;
import com.practice.fullstack.database.Oracle;
import com.practice.fullstack.frontend.Angular;

/**
 * This factory class consist of related object and become complete family of factory
 * From here we can customize requirement and handle exception also  
 * @author Manish Luste
 *
 */
public class JavaFullStackEngineer extends FullStackEngineerFactory {
	
	@Override
	public FrontEnd createFrontEnd(int noe, String expertice) {
		return new Angular(noe, expertice);
	}

	@Override
	public BackEnd createBackEnd() {
		return new SpringBoot();
	}

	@Override
	public Database createDatabase() {
		return new Oracle();
	}

	



}
