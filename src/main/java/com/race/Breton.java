package com.race;

public class Breton {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Breton(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Breton [description=" + description + "]";
	}

}
