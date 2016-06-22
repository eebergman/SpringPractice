package com.attributes;

public class Luck { // always start at 40, unless luck is a favorite, then 50

	public int luckLvl;

	public void setLuckLvl(int luckLvl) {
		this.luckLvl = luckLvl;
	}

	public Luck(int luckLvl) {
		super();
		this.luckLvl = luckLvl;
	}

	@Override
	public String toString() {
		return "Luck [luckLvl=" + luckLvl + "]";
	}

}
