package com.ivoyant.interfaces.follower.library;

import com.ivoyant.interfaces.rules.LibraryRules;

public class Reader2 implements LibraryRules{
	@Override
	public boolean membership() {
		System.out.println("Running membership in Reader2");
		return true;
	}

	@Override
	public int inTime() {
		System.out.println("Running inTime in Reader2");
		return 8;
	}
}
