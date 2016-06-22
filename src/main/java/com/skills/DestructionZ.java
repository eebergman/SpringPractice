package com.skills;

public class DestructionZ { //the Z is included to remove ambiguity

	private int destructionZLvl;

	public void setDestructionZLvl(int destructionZLvl) {
		this.destructionZLvl = destructionZLvl;
	}

	public DestructionZ(int destructionZLvl) {
		super();
		this.destructionZLvl = destructionZLvl;
	}

	@Override
	public String toString() {
		return "Destruction [destructionZLvl=" + destructionZLvl + "]";
	}
	
	

}
