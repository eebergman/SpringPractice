package com.skills;

public class Sneak {

	private int sneakLvl;

	public void setSneakLvl(int sneakLvl) {
		this.sneakLvl = sneakLvl;
	}

	public Sneak(int sneakLvl) {
		super();
		this.sneakLvl = sneakLvl;
	}

	@Override
	public String toString() {
		return "Sneak [sneakLvl=" + sneakLvl + "]";
	}

}
