package com.race;

public class Altmer {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Altmer(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Altmer [description=" + description + "]";
	}

}
