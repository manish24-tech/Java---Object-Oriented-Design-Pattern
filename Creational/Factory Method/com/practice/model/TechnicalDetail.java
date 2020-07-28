package com.practice.model;

public class TechnicalDetail {

	String skill;
	int noe;

	public TechnicalDetail() {
	}

	public TechnicalDetail(String skill, int noe) {
		if(skill.isEmpty() && noe < 1 )
			throw new NullPointerException("Developer is not eligible or incomplite technical detail");
		
		this.skill = skill;
		this.noe = noe;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNoe() {
		return noe;
	}

	public void setNoe(int noe) {
		this.noe = noe;
	}

	@Override
	public String toString() {
		return "TechnicalDetail [skill=" + skill + ", noe=" + noe + "]";
	}
	
}
