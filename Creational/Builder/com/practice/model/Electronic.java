package com.practice.model;

/**
 * Object Model : entity with setter-getter and generalize into master object  
 * @author Manish Luste
 *
 */
public class Electronic {
	int fridge;
	int AC;
	
	public Electronic() {
		super();
	}
	
	public Electronic(int fridge, int aC) {
		super();
		this.fridge = fridge;
		AC = aC;
	}

	public int getFridge() {
		return fridge;
	}

	public void setFridge(int fridge) {
		this.fridge = fridge;
	}

	public int getAC() {
		return AC;
	}

	public void setAC(int aC) {
		AC = aC;
	}

	@Override
	public String toString() {
		return "Electronic [fridge=" + fridge + ", AC=" + AC + "]";
	}
	
}
