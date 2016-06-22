package com.skills;

public class Armorer {

	private int armorerLvl;

	public void setArmorerLvl(int armorerLvl) {
		this.armorerLvl = armorerLvl;
	}

	public Armorer(int armorerLvl) {
		super();
		this.armorerLvl = armorerLvl;
	}

	@Override
	public String toString() {
		return "Armorer [armorerLvl=" + armorerLvl + "]";
	}

}
