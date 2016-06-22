package com.attributes;

public class Willpower {

	public int willpowerLvl;

	public void setWillpowerLvl(int willpowerLvl) {
		this.willpowerLvl = willpowerLvl;
	}

	public Willpower(int willpowerLvl) {
		super();
		this.willpowerLvl = willpowerLvl;
	}

	@Override
	public String toString() {
		return "Willpower [willpowerLvl=" + willpowerLvl + "]";
	}

}
