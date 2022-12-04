package com.ivoyant.interfaces.follower.hospital;

import com.ivoyant.interfaces.rules.HospitalRules;

public class Nurse implements HospitalRules {

	@Override
	public boolean wearMask() {
		System.out.println("Running wearMask() in Nurse");
		return true;
	}

	@Override
	public int maintainSilence() {
		System.out.println("Running maintainSilence() in Nurse");
		return 10;
	}

}
