package com.ivoyant.interfaces.follower.bank;

import com.ivoyant.interfaces.rules.BankRules;

public class Bank implements BankRules{
	
	@Override
	public boolean PANcard() {
		System.out.println("PANcard not applicable in Bank");
		return true;
	}

	@Override
	public int holderMinBalance() {
		System.out.println("holderMinBalance not applicable in Bank");
		return 0;
	}

	@Override
	public int bankMinBalance() {
		System.out.println("Running bankMinBalance in Bank");
		return 100000;
	}

}
