package com.ivoyant.interfaces.governor;

import com.ivoyant.interfaces.rules.BankRules;

public class RBI {

	BankRules rbi;
	public RBI(BankRules bankRules) {
		super();
		this.rbi=bankRules;
	}
	
	
	public void check() {
		System.out.println("Running PANcard, holderMinBalance & bankMinBalance");
		if (this.rbi!=null) {
			int holderMinBalance = this.rbi.holderMinBalance();
			boolean PANcard = this.rbi.PANcard();
			int bankMinBalance = this.rbi.bankMinBalance();
			if ((PANcard && holderMinBalance > 500) || (bankMinBalance >= 100000)) {
				System.out.println("Bank Rules are following");
			} else {
				System.out.println("Bank Rules are not following");
			}
		}
	}
	
}
