package com.skills;

public class Acrobatics {

	private int acrobaticsLvl;

	public void setAcrobaticsLvl(int acrobaticsLvl) {
		this.acrobaticsLvl = acrobaticsLvl;
	}

	public Acrobatics(int acrobaticsLvl) {
		super();
		this.acrobaticsLvl = acrobaticsLvl;
	}

	@Override
	public String toString() {
		return "Acrobatics [acrobaticsLvl=" + acrobaticsLvl + "]";
	}
	
	

}
