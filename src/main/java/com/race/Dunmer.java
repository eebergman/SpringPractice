package com.race;

public class Dunmer {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Dunmer(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Dunmer [description=" + description + "]";
	}

}
