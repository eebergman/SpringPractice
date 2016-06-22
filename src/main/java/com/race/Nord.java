package com.race;

public class Nord {

	public String description;

	public void setDescription(String description) {
		this.description = description;
	}

	public Nord(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Nord [description=" + description + "]";
	}

}
