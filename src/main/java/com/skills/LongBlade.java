package com.skills;

public class LongBlade {

	private int longBladeLvl;

	public void setLongBladeLvl(int longBladeLvl) {
		this.longBladeLvl = longBladeLvl;
	}

	public LongBlade(int longBladeLvl) {
		super();
		this.longBladeLvl = longBladeLvl;
	}

	@Override
	public String toString() {
		return "LongBlade [longBladeLvl=" + longBladeLvl + "]";
	}

}
