package com.attributes;

public class Endurance {

	public int enduranceLvL;

	public void setEnduranceLvL(int enduranceLvL) {
		this.enduranceLvL = enduranceLvL;
	}

	public Endurance(int enduranceLvL) {
		super();
		this.enduranceLvL = enduranceLvL;
	}

	@Override
	public String toString() {
		return "Endurance [enduranceLvL=" + enduranceLvL + "]";
	}

	// Determines health points and Fatigue
	// On lvl up divide endurance by 10 and add to hp max

}
