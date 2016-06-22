package com.attributes;

public class Intelligence {

	public int intelligenceLvL;

	public void setIntelligenceLvL(int intelligenceLvL) {
		this.intelligenceLvL = intelligenceLvL;
	}

	public Intelligence(int intelligenceLvL) {
		super();
		this.intelligenceLvL = intelligenceLvL;
	}

	@Override
	public String toString() {
		return "Intelligence [intelligenceLvL=" + intelligenceLvL + "]";
	}

}
