package com.skills;

public class Alteration {

	private int alterationLvl;

	public void setAlterationLvl(int alterationLvl) {
		this.alterationLvl = alterationLvl;
	}

	public Alteration(int alterationLvl) {
		super();
		this.alterationLvl = alterationLvl;
	}

	@Override
	public String toString() {
		return "Alteration [alterationLvl=" + alterationLvl + "]";
	}

}
