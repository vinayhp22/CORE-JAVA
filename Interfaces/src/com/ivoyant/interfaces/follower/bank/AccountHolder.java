package com.ivoyant.interfaces.follower.bank;

import com.ivoyant.interfaces.rules.BankRules;

public class AccountHolder implements BankRules {

	@Override
	public boolean PANcard() {
		System.out.println("Running PANcard in AccountHolder");
		return true;
	}

	@Override
	public int holderMinBalance() {
		System.out.println("Running holderMinBalance in AccountHolder");
		return 10000;
	}

	@Override
	public int bankMinBalance() {
		System.out.println("bankMinBalance not applicable in AccountHolder");
		return 0;
	}


}
