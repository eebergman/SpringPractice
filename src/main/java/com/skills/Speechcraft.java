package com.skills;

public class Speechcraft {

	private int speechcraftLvl;

	public void setSpeechcraftLvl(int speechcraftLvl) {
		this.speechcraftLvl = speechcraftLvl;
	}

	public Speechcraft(int speechcraftLvl) {
		super();
		this.speechcraftLvl = speechcraftLvl;
	}

	@Override
	public String toString() {
		return "Speechcraft [speechcraftLvl=" + speechcraftLvl + "]";
	}

}
