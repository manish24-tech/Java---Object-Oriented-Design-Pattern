package com.practice.cor.hiring;

public class Recruitment {

	private int noe;
	private boolean isCertified;

	public Recruitment(int noe, boolean isCertified) {
		this.noe = noe;
		this.isCertified = isCertified;
	}

	public int getNoe() {
		return noe;
	}

	public void setNoe(int noe) {
		this.noe = noe;
	}

	public boolean isCertified() {
		return isCertified;
	}

	public void setCertified(boolean isCertified) {
		this.isCertified = isCertified;
	}

}
