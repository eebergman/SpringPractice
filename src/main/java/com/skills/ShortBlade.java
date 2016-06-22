package com.skills;

public class ShortBlade {

	private int shortBladeLvl;

	public void setShortBladeLvl(int shortBladeLvl) {
		this.shortBladeLvl = shortBladeLvl;
	}

	public ShortBlade(int shortBladeLvl) {
		super();
		this.shortBladeLvl = shortBladeLvl;
	}

	@Override
	public String toString() {
		return "ShortBlade [shortBladeLvl=" + shortBladeLvl + "]";
	}

}
