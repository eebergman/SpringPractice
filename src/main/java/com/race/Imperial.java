package com.race;

public class Imperial {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Imperial(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Imperial [description=" + description + "]";
	}
	
	
}
