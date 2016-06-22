package com.skills;

public class Unarmored {

	private int unarmoredLvl;

	public void setUnarmoredLvl(int unarmoredLvl) {
		this.unarmoredLvl = unarmoredLvl;
	}

	public Unarmored(int unarmoredLvl) {
		super();
		this.unarmoredLvl = unarmoredLvl;
	}

	@Override
	public String toString() {
		return "Unarmored [unarmoredLvl=" + unarmoredLvl + "]";
	}

}
