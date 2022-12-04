package com.ivoyant.interfaces.boot;

import com.ivoyant.interfaces.follower.bank.*;
import com.ivoyant.interfaces.governor.RBI;
import com.ivoyant.interfaces.rules.*;

public class BankRunner {

	public static void main(String[] args) {
		
		BankRules bankRules= new AccountHolder();
		RBI rbi = new RBI(bankRules);
		rbi.check();
		
		System.out.println("\n");
		
		BankRules bankRules2 = new Bank();
		RBI rbi2 = new RBI(bankRules2);
		rbi2.check();
	}
}
