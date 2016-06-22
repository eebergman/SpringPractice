package com.skills;

public class BlockZ { //the Z is included to remove ambiguity

	private int blockZLvl;

	public void setBlockZLvl(int blockZLvl) {
		this.blockZLvl = blockZLvl;
	}

	public BlockZ(int blockZLvl) {
		super();
		this.blockZLvl = blockZLvl;
	}

	@Override
	public String toString() {
		return "Block [blockZLvl=" + blockZLvl + "]";
	}

}
