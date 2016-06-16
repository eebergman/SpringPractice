package com.character;

import com.character.Race.Races;

public class Character {

	// Character traits
	public String userName;
	public Races userRace;
	public boolean userGender; // t=male, f=female
	public PlayerClass userClass;
	public StarSign userStarSign;

	// Character Attributes

	// Character Skills

	// Character Values
	public HealthPoints userHP;
	public MagicPoints userMP;

	// Constructors
	public Character(String userName, Races userRace, boolean userGender, PlayerClass userClass, StarSign userStarSign,
			HealthPoints userHP, MagicPoints userMP) {
		this.userName = userName;
		this.userRace = userRace;
		this.userGender = userGender;
		this.userClass = userClass;
		this.userStarSign = userStarSign;
		this.userHP = userHP;
		this.userMP = userMP;
	}

	public Character() {
		super();
	}

	// Setters

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserRace(Races userRace) {
		this.userRace = userRace;
	}

	public void setUserGender(boolean userGender) {
		this.userGender = userGender;
	}

	public void setUserClass(PlayerClass userClass) {
		this.userClass = userClass;
	}

	public void setUserStarSign(StarSign userStarSign) {
		this.userStarSign = userStarSign;
	}

	public void setUserHP(HealthPoints userHP) {
		this.userHP = userHP;
	}

	public void setUserMP(MagicPoints userMP) {
		this.userMP = userMP;
	}

	// Getters

	public String getUserName() {
		return userName;
	}

	public Races getUserRace() {
		return userRace;
	}

	public boolean isUserGender() {
		return userGender;
	}

	public PlayerClass getUserClass() {
		return userClass;
	}

	public StarSign getUserStarSign() {
		return userStarSign;
	}

	public HealthPoints getUserHP() {
		return userHP;
	}

	public MagicPoints getUserMP() {
		return userMP;
	}

}
