package com.skills;

public class BluntWeapon {

	private int bluntWeaponLvl;

	public void setBluntWeaponLvl(int bluntWeaponLvl) {
		this.bluntWeaponLvl = bluntWeaponLvl;
	}

	public BluntWeapon(int bluntWeaponLvl) {
		super();
		this.bluntWeaponLvl = bluntWeaponLvl;
	}

	@Override
	public String toString() {
		return "BluntWeapon [bluntWeaponLvl=" + bluntWeaponLvl + "]";
	}

}
