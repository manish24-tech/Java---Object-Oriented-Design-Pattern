package com.practice.model;

/**
 *   
 * Object Model : entity with setter-getter and generalize into master object  
 * @author Manish Luste
 *
 */
public class Furniture {
	
	int chair;
	int table;
	
	public Furniture() {
		super();
	}
	
	public Furniture(int chair, int table) {
		super();
		this.chair = chair;
		this.table = table;
	}

	public int getChair() {
		return chair;
	}

	public void setChair(int chair) {
		this.chair = chair;
	}

	public int getTable() {
		return table;
	}

	public void setTable(int table) {
		this.table = table;
	}

	@Override
	public String toString() {
		return "Furniture [chair=" + chair + ", table=" + table + "]";
	}
}
