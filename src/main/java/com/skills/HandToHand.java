package com.skills;

public class HandToHand {

	private int handToHandLvl;

	public void setHandToHandLvl(int handToHandLvl) {
		this.handToHandLvl = handToHandLvl;
	}

	public HandToHand(int handToHandLvl) {
		super();
		this.handToHandLvl = handToHandLvl;
	}

	@Override
	public String toString() {
		return "HandToHand [handToHandLvl=" + handToHandLvl + "]";
	}
	
	

}
