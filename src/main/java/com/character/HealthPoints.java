package com.character;

public class HealthPoints {

	public int healthPoints;

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public HealthPoints(int healthPoints) {
		super();
		this.healthPoints = healthPoints;
	}

	@Override
	public String toString() {
		return "HealthPoints [healthPoints=" + healthPoints + "]";
	}

}
