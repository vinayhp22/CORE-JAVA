package com.ivoyant.interfaces.follower.metro;

import com.ivoyant.interfaces.rules.MetroRules;

public class Passengers implements MetroRules{

	@Override
	public boolean alcoholic() {
		System.out.println("Running alcoholic in PASSENGER");
		return false;
	}

	@Override
	public boolean wearMask() {
		System.out.println("Running wearMask in PASSENGER");
		return true;
	}

}
