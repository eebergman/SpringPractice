package com.skills;

public class Mysticism {

	private int mysticismLvl;

	public void setMysticismLvl(int mysticismLvl) {
		this.mysticismLvl = mysticismLvl;
	}

	public Mysticism(int mysticismLvl) {
		super();
		this.mysticismLvl = mysticismLvl;
	}

	@Override
	public String toString() {
		return "Mysticism [mysticismLvl=" + mysticismLvl + "]";
	}

}
