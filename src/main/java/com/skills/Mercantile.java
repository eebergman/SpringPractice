package com.skills;

public class Mercantile {

	private int mercantileLvl;

	public void setMercantileLvl(int mercantileLvl) {
		this.mercantileLvl = mercantileLvl;
	}

	public Mercantile(int mercantileLvl) {
		super();
		this.mercantileLvl = mercantileLvl;
	}

	@Override
	public String toString() {
		return "Mercantile [mercantileLvl=" + mercantileLvl + "]";
	}

}
