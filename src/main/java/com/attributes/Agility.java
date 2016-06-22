package com.attributes;

public class Agility {

	public int agilityLvl;

	public void setAgilityLvl(int agilityLvl) {
		this.agilityLvl = agilityLvl;
	}

	public Agility(int agilityLvl) {
		super();
		this.agilityLvl = agilityLvl;
	}

	@Override
	public String toString() {
		return "Agility [agilityLvl=" + agilityLvl + "]";
	}

}
