package com.race;

public class Orc {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Orc(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Orc [description=" + description + "]";
	}
	
	
}
