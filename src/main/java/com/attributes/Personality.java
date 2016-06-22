package com.attributes;

public class Personality {

	public int personalityLvl;

	public void setPersonalityLvl(int personalityLvl) {
		this.personalityLvl = personalityLvl;
	}

	public Personality(int personalityLvl) {
		super();
		this.personalityLvl = personalityLvl;
	}

	@Override
	public String toString() {
		return "Personality [personalityLvl=" + personalityLvl + "]";
	}

}
