package com.ivoyant.interfaces.governor;

import com.ivoyant.interfaces.rules.HospitalRules;

public class HospitalManagement {

	private HospitalRules hospital;

	public HospitalManagement(HospitalRules hospital) {
	super();
		this.hospital = hospital;
	}

	public void checking() {
		System.out.println("Running wearMask and maintainSilence...");
		if (this.hospital != null) {
			boolean wearMask = this.hospital.wearMask();
			int maintainSilence = this.hospital.maintainSilence();
			if (wearMask == true && maintainSilence < 10) {
				System.out.println("Doctor is following the rules...");
			} else {
				System.out.println("Doctor is not following the rules...");
			}
		}
	}
}
