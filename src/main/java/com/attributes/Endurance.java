package com.attributes;

public class Endurance {

	public int enduranceLvl;

	public void setEnduranceLvl(int enduranceLvl) {
		this.enduranceLvl = enduranceLvl;
	}

	public Endurance(int enduranceLvl) {
		super();
		this.enduranceLvl = enduranceLvl;
	}

	@Override
	public String toString() {
		return "Endurance [enduranceLvl=" + enduranceLvl + "]";
	}

	// Determines health points and Fatigue
	// On lvl up divide endurance by 10 and add to hp max

}
