package com.race;

public class Khajiit {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Khajiit(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Khajiit [description=" + description + "]";
	}
	
	
}
