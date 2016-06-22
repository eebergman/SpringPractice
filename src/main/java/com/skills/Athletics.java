package com.skills;

public class Athletics {

	private int athleticsLvl;

	public void setAthleticsLvl(int athleticsLvl) {
		this.athleticsLvl = athleticsLvl;
	}

	public Athletics(int athleticsLvl) {
		super();
		this.athleticsLvl = athleticsLvl;
	}

	@Override
	public String toString() {
		return "Athletics [athleticsLvl=" + athleticsLvl + "]";
	}

}
