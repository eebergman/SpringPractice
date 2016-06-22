package com.skills;

public class Security {

	private int securityLvl;

	public void setSecurityLvl(int securityLvl) {
		this.securityLvl = securityLvl;
	}

	public Security(int securityLvl) {
		super();
		this.securityLvl = securityLvl;
	}

	@Override
	public String toString() {
		return "Security [securityLvl=" + securityLvl + "]";
	}

}
