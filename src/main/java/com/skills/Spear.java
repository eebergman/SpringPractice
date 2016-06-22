package com.skills;

public class Spear {

	private int spearLvl;

	public void setSpearLvl(int spearLvl) {
		this.spearLvl = spearLvl;
	}

	public Spear(int spearLvl) {
		super();
		this.spearLvl = spearLvl;
	}

	@Override
	public String toString() {
		return "Spear [spearLvl=" + spearLvl + "]";
	}

}
