package com.skills;

public class LightArmor {

	private int lightArmorLvl;

	public void setLightArmorLvl(int lightArmorLvl) {
		this.lightArmorLvl = lightArmorLvl;
	}

	public LightArmor(int lightArmorLvl) {
		super();
		this.lightArmorLvl = lightArmorLvl;
	}

	@Override
	public String toString() {
		return "LightArmor [lightArmorLvl=" + lightArmorLvl + "]";
	}

}
