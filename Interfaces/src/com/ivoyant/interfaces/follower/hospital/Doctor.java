package com.ivoyant.interfaces.follower.hospital;

import com.ivoyant.interfaces.rules.HospitalRules;

public class Doctor implements HospitalRules {

	@Override
	public boolean wearMask() {
		System.out.println("Running wearMask() in Doctor");
		return true;
	}

	@Override
	public int maintainSilence() {
		System.out.println("Running maintainSilence() in Doctor");
		return 5;
	}

}
