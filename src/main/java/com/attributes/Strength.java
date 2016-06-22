package com.attributes;

public class Strength {

	public int strengthLvl;

	public void setStrengthLvl(int strengthLvl) {
		this.strengthLvl = strengthLvl;
	}

	public Strength(int strengthLvl) {
		super();
		this.strengthLvl = strengthLvl;
	}

	@Override
	public String toString() {
		return "Strength [strengthLvl=" + strengthLvl + "]";
	}

}
