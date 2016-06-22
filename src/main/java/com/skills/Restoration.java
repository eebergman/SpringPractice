package com.skills;

public class Restoration {

	private int restorationLvl;

	public void setRestorationLvl(int restorationLvl) {
		this.restorationLvl = restorationLvl;
	}

	public Restoration(int restorationLvl) {
		super();
		this.restorationLvl = restorationLvl;
	}

	@Override
	public String toString() {
		return "Restoration [restorationLvl=" + restorationLvl + "]";
	}

}
