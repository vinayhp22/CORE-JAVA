package com.ivoyant.interfaces.follower.metro;

import com.ivoyant.interfaces.rules.MetroRules;

public class Driver implements MetroRules{

	@Override
	public boolean alcoholic() {
		System.out.println("Running alcoholic in DRIVER");
		return false;
	}

	@Override
	public boolean wearMask() {
		System.out.println("Running wearMask in DRIVER");
		return false;
	}

}
