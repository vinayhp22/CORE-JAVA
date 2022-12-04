package com.ivoyant.interfaces.follower.library;

import com.ivoyant.interfaces.rules.LibraryRules;

public class Reader implements LibraryRules{

	@Override
	public boolean membership() {
		System.out.println("Running membership in Reader");
		return true;
	}

	@Override
	public int inTime() {
		System.out.println("Running inTime in Reader");
		return 9;
	}

}


