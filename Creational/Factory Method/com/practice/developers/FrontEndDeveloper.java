package com.practice.developers;

import com.practice.factory.Developer;
import com.practice.model.PersonalDetail;
import com.practice.model.TechnicalDetail;

/**
 * This class is responsible to manage business logic which is hidden and in future something is change then this is the only place where changes need to done
 * @author Manish Luste
 *
 */
public class FrontEndDeveloper implements Developer {

	String developerType;
	
	public FrontEndDeveloper() {}
	
	public FrontEndDeveloper(String developerType) {
		if (developerType.isEmpty())
			throw new NullPointerException("Developer Type does not specified!");
		
		this.developerType = developerType;
	}

	@Override
	public void getDeveloperByType() {
		
		PersonalDetail pesonal = new PersonalDetail("Nehal", 25);
		TechnicalDetail technical = new TechnicalDetail("Angular", 2);
		
		System.out.println("FrontEndDeveloper.getDeveloperType() Type : "+developerType);
		System.out.println("=> Personal Detail : \n\t Name : "+pesonal.getName()+" | Age : "+pesonal.getAge());
		System.out.println("=> Technical Detail : \n\t Skill : "+technical.getSkill()+" | Experiance : "+technical.getNoe());

	}

}
