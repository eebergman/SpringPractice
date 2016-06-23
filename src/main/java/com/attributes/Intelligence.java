package com.attributes;

public class Intelligence {

	public int intelligenceLvl;

	public void setIntelligenceLvl(int intelligenceLvl) {
		this.intelligenceLvl = intelligenceLvl;
	}

	public Intelligence(int intelligenceLvl) {
		super();
		this.intelligenceLvl = intelligenceLvl;
	}

	@Override
	public String toString() {
		return "Intelligence [intelligenceLvl=" + intelligenceLvl + "]";
	}

}
