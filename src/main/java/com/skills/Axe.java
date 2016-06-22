package com.skills;

public class Axe {

	private int axeLvl;

	public void setAxeLvl(int axeLvl) {
		this.axeLvl = axeLvl;
	}

	public Axe(int axeLvl) {
		super();
		this.axeLvl = axeLvl;
	}

	@Override
	public String toString() {
		return "Axe [axeLvl=" + axeLvl + "]";
	}

}
