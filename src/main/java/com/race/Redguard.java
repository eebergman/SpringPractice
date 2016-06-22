package com.race;

public class Redguard {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Redguard(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Redguard [description=" + description + "]";
	}
	
	
}
