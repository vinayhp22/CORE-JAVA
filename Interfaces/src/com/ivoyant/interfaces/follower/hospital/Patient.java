package com.ivoyant.interfaces.follower.hospital;

import com.ivoyant.interfaces.rules.HospitalRules;

public class Patient implements HospitalRules {

	@Override
	public boolean wearMask() {
		System.out.println("Running wearMask() in Patient");
		return false;
	}

	@Override
	public int maintainSilence() {
		System.out.println("Running maintainSilence() in Patient");
		return 12;
	}

}
