package com.attributes;

public class Speed {

	public int speedLvl;

	public void setSpeedLvl(int speedLvl) {
		this.speedLvl = speedLvl;
	}

	public Speed(int speedLvl) {
		super();
		this.speedLvl = speedLvl;
	}

	@Override
	public String toString() {
		return "Speed [speedLvl=" + speedLvl + "]";
	}

}
