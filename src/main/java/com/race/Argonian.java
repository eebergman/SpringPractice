package com.race;

public class Argonian {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Argonian(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Argonian [description=" + description + "]";
	}
	
}

// http://www.ign.com/wikis/the-elder-scrolls-iii-morrowind/Races
// http://www.uesp.net/wiki/Morrowind:Skills
