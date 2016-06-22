package com.skills;

public class HeavyArmor {

	private int heavyArmorLvl;

	public void setHeavyArmorLvL(int heavyArmorLvl) {
		this.heavyArmorLvl = heavyArmorLvl;
	}

	public HeavyArmor(int heavyArmorLvl) {
		super();
		this.heavyArmorLvl = heavyArmorLvl;
	}

	@Override
	public String toString() {
		return "HeavyArmor [heavyArmorLvl=" + heavyArmorLvl + "]";
	}
	
	

}
