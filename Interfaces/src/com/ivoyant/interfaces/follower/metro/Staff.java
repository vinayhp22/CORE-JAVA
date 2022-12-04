package com.ivoyant.interfaces.follower.metro;

import com.ivoyant.interfaces.rules.MetroRules;

public class Staff implements MetroRules{

	@Override
	public boolean alcoholic() {
		System.out.println("Running alcoholic in STAFF");
		return false;
	}

	@Override
	public boolean wearMask() {
		System.out.println("Running wearMask in STAFF");
		return true;
	}

	
	
}
