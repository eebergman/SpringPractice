package com.skills;

public class Alchemy {

	private int alchemyLvl;

	public void setAlchemyLvl(int alchemyLvl) {
		this.alchemyLvl = alchemyLvl;
	}

	public Alchemy(int alchemyLvl) {
		super();
		this.alchemyLvl = alchemyLvl;
	}

	@Override
	public String toString() {
		return "Alchemy [alchemyLvl=" + alchemyLvl + "]";
	}
	
	

}
