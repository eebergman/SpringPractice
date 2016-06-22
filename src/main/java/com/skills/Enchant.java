package com.skills;

public class Enchant {

	private int enchantLvl;

	public void setEnchantLvl(int enchantLvl) {
		this.enchantLvl = enchantLvl;
	}

	public Enchant(int enchantLvl) {
		super();
		this.enchantLvl = enchantLvl;
	}

	@Override
	public String toString() {
		return "Enchant [enchantLvl=" + enchantLvl + "]";
	}

}
