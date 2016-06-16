package com.character;

public class MagicPoints {

	public int magicPoints;

	public int getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}

	public MagicPoints(int magicPoints) {
		super();
		this.magicPoints = magicPoints;
	}

	@Override
	public String toString() {
		return "MagicPoints [magicPoints=" + magicPoints + "]";
	}

}
