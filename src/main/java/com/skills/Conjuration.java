package com.skills;

public class Conjuration {

	private int conjurationLvl;

	public void setConjurationLvl(int conjurationLvl) {
		this.conjurationLvl = conjurationLvl;
	}

	public Conjuration(int conjurationLvl) {
		super();
		this.conjurationLvl = conjurationLvl;
	}

	@Override
	public String toString() {
		return "Conjuration [conjurationLvl=" + conjurationLvl + "]";
	}

}
