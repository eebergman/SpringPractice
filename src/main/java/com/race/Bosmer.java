package com.race;

public class Bosmer {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Bosmer(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Bosmer [description=" + description + "]";
	}

}
