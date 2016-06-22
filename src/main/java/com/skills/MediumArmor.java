package com.skills;

public class MediumArmor {

	private int mediumArmorLvl;

	public void setMediumArmorLvl(int mediumArmorLvl) {
		this.mediumArmorLvl = mediumArmorLvl;
	}

	public MediumArmor(int mediumArmorLvl) {
		super();
		this.mediumArmorLvl = mediumArmorLvl;
	}

	@Override
	public String toString() {
		return "MediumArmor [mediumArmorLvl=" + mediumArmorLvl + "]";
	}

}
