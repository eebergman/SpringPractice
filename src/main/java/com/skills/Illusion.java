package com.skills;

public class Illusion {

	private int illusionLvl;

	public void setIllusionLvl(int illusionLvl) {
		this.illusionLvl = illusionLvl;
	}

	public Illusion(int illusionLvl) {
		super();
		this.illusionLvl = illusionLvl;
	}

	@Override
	public String toString() {
		return "Illusion [illusionLvl=" + illusionLvl + "]";
	}

}
