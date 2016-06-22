package com.skills;

public class Marksman {

	private int marksmanLvl;

	public void setMarksmanLvl(int marksmanLvl) {
		this.marksmanLvl = marksmanLvl;
	}

	public Marksman(int marksmanLvl) {
		super();
		this.marksmanLvl = marksmanLvl;
	}

	@Override
	public String toString() {
		return "Marksman [marksmanLvl=" + marksmanLvl + "]";
	}

}
